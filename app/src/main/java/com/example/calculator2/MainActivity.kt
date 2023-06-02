package com.example.calculator2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator2.ui.theme.Calculator2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculator2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ButtonLayout()
                }
            }
        }
    }
}

@Composable
fun ButtonLayout() {
    Box(
        Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.blue))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(6.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)

        ) {


            Text(

                text = "9",
                textAlign = TextAlign.Right,
                lineHeight = 60.sp,
                letterSpacing = 2.sp,
                modifier = Modifier
                    .fillMaxWidth(),
               // overflow = TextOverflow.Ellipsis,
                color = Color.White,
                maxLines = 2,
                fontSize = 80.sp,


            )



            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberButton(
                    name = "AC",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = colorResource(R.color.light)
                )
                NumberButton(
                    name = "+/-",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = colorResource(R.color.light)

                )
                NumberButton(
                    name = "%",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = colorResource(R.color.light)

                )
                NumberButton(
                    name = "/",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = colorResource(R.color.yellow)

                )

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberButton(
                    name = "7", modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray
                )
                NumberButton(
                    name = "8",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray

                )
                NumberButton(
                    name = "9",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray

                )
                NumberButton(
                    name = "x",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = colorResource(R.color.yellow)

                )

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberButton(
                    name = "4", modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray
                )
                NumberButton(
                    name = "5",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray

                )
                NumberButton(
                    name = "6",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray

                )
                NumberButton(
                    name = "-",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = colorResource(R.color.yellow)

                )

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberButton(
                    name = "1", modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray
                )
                NumberButton(
                    name = "2",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray

                )
                NumberButton(
                    name = "3",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray

                )
                NumberButton(
                    name = "+",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = colorResource(R.color.yellow)

                )

            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                NumberButton(
                    name = "0",

                    modifier = Modifier
                        .aspectRatio(1.75f)
                        .weight(1.75f)
                        .clip(CircleShape),
                    color = Color.Gray,

                )
                NumberButton(
                    name = ",",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = Color.Gray

                )
                NumberButton(
                    name = "=",
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f)
                        .clip(CircleShape),
                    color = colorResource(R.color.yellow)

                )


            }
        }
    }

}


@Composable
fun NumberButton(name: String, modifier: Modifier = Modifier, color: Color) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .background(color)


    ) {
        Text(
            text = name,
            fontSize = 40.sp,
            color = Color.White,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NumberButtonPreview() {
    Calculator2Theme {
        ButtonLayout()

    }
}