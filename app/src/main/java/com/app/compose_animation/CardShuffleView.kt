package com.app.compose_animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.app.compose_animation.LocalData.getCardList
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun CardShuffleView3(isVisibl: MutableTransitionState<Boolean>) {
    val cards by remember { mutableStateOf(getCardList()) }
    val angleStep = PI / (cards.size - 1)
    val radius = 200.dp
    val itemSize = 104.dp
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center
        ) {
            cards.forEachIndexed { index, card ->
                val angle = angleStep * index - PI
                val offsetX = (radius * cos(angle.toFloat()))
                val offsetY = (radius * sin(angle.toFloat()))
                val isVisible = remember { MutableTransitionState(false) }

                scope.launch {
                    delay((index * 100).toLong())  // delay in milliseconds
                    isVisible.targetState = !isVisible.targetState
                }

                this@Column.AnimatedVisibility(
                    visibleState = isVisible,
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
}



