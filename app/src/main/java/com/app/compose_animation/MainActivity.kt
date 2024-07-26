package com.app.compose_animation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.app.compose_animation.ui.theme.ButtonPink
import com.app.compose_animation.ui.theme.ComposeAnimationTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAnimationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val isVisible = remember { MutableTransitionState(false) }

                    Box(Modifier.fillMaxSize()) {
                        Image(
                            androidx.compose.ui.res.painterResource(id = R.drawable.ic_bg),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize()
                        )
                        /*  CardShuffleView2(
                              modifier = Modifier
                                  .align(Alignment.BottomCenter)
                                  .padding(bottom = 200.dp)
                          )*/
                        CardShuffleView3(isVisible)

                        Text(
                            "Shuffle the cards",
                            style = TextStyle.Default.copy(color = Color.White),
                            modifier = Modifier
                                .wrapContentSize()
                                .clip(RoundedCornerShape(30.dp))
                                .align(Alignment.BottomCenter)
                                .background(color = ButtonPink)
                                .padding(horizontal = 40.dp, vertical = 20.dp)
                                .clickable {
                                    isVisible.targetState = !isVisible.targetState
                                }
                        )
                        Spacer(modifier = Modifier.height(30.dp))
                    }
                }
            }
        }
    }
}

