package com.example.calculator2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculationAction) {
        state = state.copy(number2 = state.number2)
        when (action) {
            is CalculationAction.Calculate -> calculate()
            is CalculationAction.Change -> change()
            is CalculationAction.Nothing -> doNothing()
            is CalculationAction.Clear -> state = CalculatorState()
            is CalculationAction.Operation -> enterOperation(action.operation)
            is CalculationAction.Number -> enterNumber(action.number)
            is CalculationAction.Decimal -> decimal()
        }

    }

    private fun decimal() {
        if (
            state.number1.isNotBlank() &&
            !state.number1.contains(".") &&
            state.number2.isBlank()
        ) {

            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        }

        if (
            state.number2.isNotBlank() &&
            !state.number2.contains(".")
        ) {

            state = state.copy(
                number2 = state.number2 + "."
            )
            return
        }

    }

    private fun enterNumber(number: String) {
        state = if (state.operation == null) {
            state.copy(
                number1 = state.number1 + number
            )
        } else {
            state.copy(
                number2 = state.number2 + number
            )
        }


    }


    private fun doNothing() {
    }

    private fun change() {
        if (state.number1.isNotBlank()) {

            val number1: Double = state.number1.toDouble()
            if (number1 > 0) {
                state = state.copy(
                    number1 = "-" + state.number1
                )
            }

            if (number1 < 0) {
                state = state.copy(
                    number1 = state.number1.substring(1)
                )
            }

        }
    }


    private fun calculate() {
        val num1 = state.number1.toDoubleOrNull()
        val num2 = state.number2.toDoubleOrNull()
        if (num1 !=null && num2 !=null) {
            var result: Any = when (state.operation) {
                CalculatorOperation.Add -> num1 + num2
                CalculatorOperation.Multiplication -> num1 * num2
                CalculatorOperation.Subtract -> num1 - num2
                CalculatorOperation.Division -> num1 / num2
                CalculatorOperation.Percentage -> (num1 / num2) * 0.01
                else -> {
                    0.0
                }
            }

            if (result.toString().endsWith(".0")) {
                result = result.toString().dropLast(2)
            }

            state = state.copy(
                number1 = result.toString(),
                number2 = "",
                operation = null
            )
        }
    }

    private fun enterOperation(operation: CalculatorOperation) {

        if (state.operation == null) {

            state = state.copy(
                operation = operation
            )
            return
        }

    }
}