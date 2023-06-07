package com.example.calculator2

sealed class CalculatorOperation(val symbol:String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiplication: CalculatorOperation("*")
    object Division: CalculatorOperation("/")
    object Percentage: CalculatorOperation("%")

}