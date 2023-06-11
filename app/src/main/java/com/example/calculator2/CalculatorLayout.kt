package com.example.calculator2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator2.ui.theme.Blue
import com.example.calculator2.ui.theme.Light
import com.example.calculator2.ui.theme.Orange


@Composable
fun ButtonLayout(
    state: CalculatorState,
    onAction: (CalculationAction) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            //.padding(6.dp)
            .background(Color.Black),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Bottom
    ) {

        Text(
            text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
            textAlign = TextAlign.Right,
            lineHeight = 60.sp,
            letterSpacing = 2.sp,
            modifier = Modifier.fillMaxWidth(),
            color = Color.White,
            maxLines = 2,
            fontSize = 60.sp,
        )

        Row1(onAction)
        Row2(onAction)
        Row3(onAction)
        Row4(onAction)
        Row5(onAction)


    }
}

@Composable
fun Row1(onAction: (CalculationAction) -> Unit) {
    Row(
        Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val circleButtonModifier = Modifier
            .aspectRatio(1f)
            .weight(1f)
            .clip(CircleShape)

        val names = mutableListOf(BUTTON_AC, BUTTON_CHANGE, BUTTON_PERCENTAGE, BUTTON_DIVIDE)

        for (i in names) {
            val color = when (i) {
                BUTTON_AC, BUTTON_CHANGE, BUTTON_PERCENTAGE -> Blue
                else -> Orange
            }
            val action = when (i) {
                BUTTON_AC -> CalculationAction.Clear
                BUTTON_CHANGE -> CalculationAction.Change
                BUTTON_PERCENTAGE -> CalculationAction.Operation(CalculatorOperation.Percentage)
                BUTTON_DIVIDE -> CalculationAction.Operation(CalculatorOperation.Division)
                else -> CalculationAction.Nothing
            }

            NumberButton(
                name = i,
                modifier = circleButtonModifier,
                color = color
            ) { onAction(action) }
        }

    }
    Spacer(modifier = Modifier.padding(2.dp))
}

@Composable
fun Row2(onAction: (CalculationAction) -> Unit) {
    Row(
        Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val circleButtonModifier = Modifier
            .aspectRatio(1f)
            .weight(1f)
            .clip(CircleShape)

        val names = mutableListOf(NUMBER_7,NUMBER_8,NUMBER_9,BUTTON_MULTIPLY)

        for (i in names) {

            val color = when (i) {
                NUMBER_7, NUMBER_8, NUMBER_9 -> Light
                else -> Orange
            }
            val action = when (i) {
                NUMBER_7 -> CalculationAction.Number("7")
                NUMBER_8 -> CalculationAction.Number("8")
                NUMBER_9 -> CalculationAction.Number("9")
                BUTTON_MULTIPLY -> CalculationAction.Operation(CalculatorOperation.Multiplication)
                else -> CalculationAction.Nothing
            }


            NumberButton(
                name = i,
                modifier = circleButtonModifier,
                color = color
            ) { onAction(action) }
        }

    }
    Spacer(modifier = Modifier.padding(2.dp))
}

@Composable
fun Row3(onAction: (CalculationAction) -> Unit) {
    Row(
        Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val circleButtonModifier = Modifier
            .aspectRatio(1f)
            .weight(1f)
            .clip(CircleShape)

        val names = mutableListOf(NUMBER_4, NUMBER_5, NUMBER_6, BUTTON_SUBTRACT)

        for (i in names) {
            val color = when (i) {
                NUMBER_4, NUMBER_5, NUMBER_6 -> Light
                else -> Orange
            }
            val action = when (i) {
                NUMBER_4 -> CalculationAction.Number("4")
                NUMBER_5 -> CalculationAction.Number("5")
                NUMBER_6 -> CalculationAction.Number("6")
                BUTTON_SUBTRACT -> CalculationAction.Operation(CalculatorOperation.Subtract)
                else -> CalculationAction.Nothing
            }


            NumberButton(
                name = i,
                modifier = circleButtonModifier,
                color = color
            ) { onAction(action) }
        }

    }
    Spacer(modifier = Modifier.padding(2.dp))
}

@Composable
fun Row4(onAction: (CalculationAction) -> Unit) {
    Row(
        Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val circleButtonModifier = Modifier
            .aspectRatio(1f)
            .weight(1f)
            .clip(CircleShape)

        val names = mutableListOf(NUMBER_1, NUMBER_2, NUMBER_3, BUTTON_ADDITION)

        for (i in names) {
            val color = when (i) {
                NUMBER_1, NUMBER_2, NUMBER_3 -> Light
                else -> Orange
            }
            val action = when (i) {
                NUMBER_1 -> CalculationAction.Number("1")
                NUMBER_2 -> CalculationAction.Number("2")
                NUMBER_3 -> CalculationAction.Number("3")
                BUTTON_ADDITION -> CalculationAction.Operation(CalculatorOperation.Add)
                else -> CalculationAction.Nothing
            }

            NumberButton(
                name = i,
                modifier = circleButtonModifier,
                color = color
            ) { onAction(action) }
        }

    }
    Spacer(modifier = Modifier.padding(2.dp))
}

@Composable
fun Row5(onAction: (CalculationAction) -> Unit) {
    Row(
        Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val circleButtonModifier = Modifier
            .aspectRatio(1f)
            .weight(1f)
            .clip(CircleShape)

        val circleButtonModifierBig = Modifier
            .aspectRatio(2f)
            .weight(2f)
            .clip(CircleShape)

        val names = mutableListOf(NUMBER_0, BUTTON_COMMA, BUTTON_EQUAL)

        for (i in names) {
            val mod = when (i) {
                BUTTON_COMMA, BUTTON_EQUAL -> circleButtonModifier
                else -> circleButtonModifierBig
            }

            val color = when (i) {
                NUMBER_0, BUTTON_COMMA -> Light
                else -> Orange
            }
            val action = when (i) {
                NUMBER_0 -> CalculationAction.Number("0")
                BUTTON_COMMA -> CalculationAction.Decimal
                BUTTON_EQUAL -> CalculationAction.Calculate
                else -> CalculationAction.Nothing
            }

            NumberButton(
                name = i,
                modifier = mod,
                color = color
            ) { onAction(action) }
        }

    }
    Spacer(modifier = Modifier.padding(2.dp))
}


@Composable
fun NumberButton(
    name: String,
    modifier: Modifier = Modifier,
    color: Color,
    onAction: () -> Unit
) {
    TextButton(
        onClick = { onAction() },
        modifier = modifier.background(color),
    ) {
        Text(
            text = name,
            fontSize = 30.sp,
            color = Color.White,
            modifier = Modifier.padding(8.dp)
        )
    }
}
