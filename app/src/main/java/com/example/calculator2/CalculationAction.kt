package com.example.calculator2

sealed class CalculationAction {
    data class Number(val number: String) : CalculationAction()
    object Clear:CalculationAction()
    object Decimal:CalculationAction()
    object Calculate:CalculationAction()
    object Nothing:CalculationAction()
    object Change:CalculationAction()
    data class Operation(val operation: CalculatorOperation):CalculationAction()

}
