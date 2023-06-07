package com.example.calculator2

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculationAction) {
        when (action) {
            is CalculationAction.Calculate -> calculate()
            is CalculationAction.Change -> change()
            is CalculationAction.Nothing -> doNothing()
            is CalculationAction.Clear -> performClear()
            is CalculationAction.Operation -> enterOperation(action.operation)
            is CalculationAction.Number -> enterNumber(action.number)
            is CalculationAction.Decimal -> decimal()
        }

    }

    private fun decimal() {
        Log.e("omer", "decimal is called")

    }

    private fun enterNumber(number: String) {

        Log.e("omer", "number is clicked $number")
        state = state.copy(
          number1  =  state.number1+number +" okkes"
        )
        Log.e("omer", "state ${state.number1}")

    }



    private fun performClear() {

        Log.e("omer", "AC is called")
    }

    private fun doNothing() {

    }

    private fun change() {
        Log.e("omer", "change is called")
    }



    private fun calculate() {
        Log.e("omer", "calculate is called")

    }

    private fun enterOperation(operation: CalculatorOperation) {
        Log.e("omer", "operation is called ${operation.symbol}" )

    }
}