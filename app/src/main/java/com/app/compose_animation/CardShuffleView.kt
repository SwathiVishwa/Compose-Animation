package com.app.compose_animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.app.compose_animation.LocalData.getCards
import com.app.compose_animation.LocalData.shuffleCards
import com.app.compose_animation.ui.theme.ButtonPink
import kotlinx.coroutines.delay
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun CardShuffleView3() {
    val selectedCardList: MutableList<Card> = mutableListOf()
    val cardsList by remember { mutableStateOf(getCards()) }

    var shuffledCards by remember { mutableStateOf(cardsList) }
    var selectedCards = remember { mutableStateOf(selectedCardList) }
    val angleStep = PI / (shuffledCards.size - 1)
    val radius = 200.dp
    val itemSize = 104.dp
    var isVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        getAddCards(selectedCards)
        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.BottomCenter
        ) {
            shuffledCards.forEachIndexed { index, card ->
                val angle = angleStep * index - PI
                val offsetX = (radius * cos(angle.toFloat()))
                val offsetY = (radius * sin(angle.toFloat()))

                // Use the state variable to control visibility
                val cardVisibilityState =
                    remember { MutableTransitionState(false).apply { targetState = isVisible } }

                LaunchedEffect(isVisible) {
                    // Delay the animation to create a staggered effect
                    delay((index * 100).toLong())
                    cardVisibilityState.targetState = isVisible
                }
                Column {
                    AnimatedVisibility(
                        visibleState = cardVisibilityState,
                        enter = fadeIn() + slideInHorizontally(),
                        exit = fadeOut() + slideOutHorizontally()
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_backside),
                            contentDescription = null,
                            modifier = Modifier
                                .size(itemSize)
                                .offset(x = offsetX, y = offsetY)
                                .rotate((-90 + (angle * 180 / PI)).toFloat())
                        )
                    }
                }
            }
        }


        // Button to trigger the animation
        androidx.compose.material3.Text(
            "Shuffle the cards",
            style = TextStyle.Default.copy(color = Color.White),
            modifier = Modifier
                .wrapContentSize()
                .clip(RoundedCornerShape(30.dp))

                .background(color = ButtonPink)
                .padding(horizontal = 40.dp, vertical = 20.dp)
                .clickable {
                    shuffledCards = shuffleCards(cardsList)
                    isVisible = !isVisible
                })
    }
}

@Composable
fun getAddCards(selectedCards: MutableState<MutableList<Card>>) {
    LazyVerticalGrid(columns = GridCells.Fixed(3), contentPadding = PaddingValues(10.dp)) {
        items(9) { index ->
            Image(
                painter = painterResource(id = selectedCards.value[index].imgResource),
                contentDescription = "",
                modifier = Modifier
                    .padding(vertical = 25.dp)
                    .size(width = 60.dp, height = 100.dp)
            )
        }

    }
}




