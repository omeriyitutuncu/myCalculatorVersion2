package com.example.calculator2

import org.junit.Assert
import org.junit.Test

class CalculatorViewModelTest {

    private val calculatorViewModel = CalculatorViewModel()

    @Test
    fun test_Addition() {
        calculatorViewModel.onAction(CalculationAction.Number("2"))
        calculatorViewModel.onAction(CalculationAction.Operation(CalculatorOperation.Add))
        calculatorViewModel.onAction(CalculationAction.Number("3"))
        calculatorViewModel.onAction(CalculationAction.Calculate)
        Assert.assertEquals("5", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }

    @Test
    fun test_Subtraction() {
        calculatorViewModel.onAction(CalculationAction.Number("20"))
        calculatorViewModel.onAction(CalculationAction.Operation(CalculatorOperation.Subtract))
        calculatorViewModel.onAction(CalculationAction.Number("3"))
        calculatorViewModel.onAction(CalculationAction.Calculate)
        Assert.assertEquals("17", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }

    @Test
    fun test_Division() {
        calculatorViewModel.onAction(CalculationAction.Number("6"))
        calculatorViewModel.onAction(CalculationAction.Operation(CalculatorOperation.Division))
        calculatorViewModel.onAction(CalculationAction.Number("3"))
        calculatorViewModel.onAction(CalculationAction.Calculate)
        Assert.assertEquals("2", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }

    @Test
    fun test_Multiplication() {
        calculatorViewModel.onAction(CalculationAction.Number("2"))
        calculatorViewModel.onAction(CalculationAction.Operation(CalculatorOperation.Multiplication))
        calculatorViewModel.onAction(CalculationAction.Number("3"))
        calculatorViewModel.onAction(CalculationAction.Calculate)
        Assert.assertEquals("6", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }

    @Test
    fun test_Percentage() {
        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Operation(CalculatorOperation.Percentage))
        calculatorViewModel.onAction(CalculationAction.Number("2"))
        calculatorViewModel.onAction(CalculationAction.Calculate)
        Assert.assertEquals("0.005", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }

    @Test
    fun test_Decimal_first_1() {
        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Operation(CalculatorOperation.Percentage))

        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Decimal)
        calculatorViewModel.onAction(CalculationAction.Number("2"))

        Assert.assertEquals("1", calculatorViewModel.state.number1)
        Assert.assertEquals("1.2", calculatorViewModel.state.number2)
    }
    @Test
    fun test_Decimal_first_2() {
        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Operation(CalculatorOperation.Percentage))

        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Decimal)
        calculatorViewModel.onAction(CalculationAction.Decimal)
        calculatorViewModel.onAction(CalculationAction.Number("2"))

        Assert.assertEquals("1", calculatorViewModel.state.number1)
        Assert.assertEquals("1.2", calculatorViewModel.state.number2)
    }

    @Test
    fun test_Decimal_second() {
        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Decimal)
        calculatorViewModel.onAction(CalculationAction.Number("2"))

        Assert.assertEquals("1.2", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }
    @Test
    fun test_Change() {
        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Number("2"))
        calculatorViewModel.onAction(CalculationAction.Change)

        Assert.assertEquals("-12", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }
    @Test
    fun test_ReChange() {
        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Change)
        calculatorViewModel.onAction(CalculationAction.Number("2"))
        calculatorViewModel.onAction(CalculationAction.Change)

        Assert.assertEquals("12", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }

    @Test
    fun test_Clear() {
        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Number("2"))
        calculatorViewModel.onAction(CalculationAction.Clear)

        Assert.assertEquals("", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }
    @Test
    fun test_DoNothing() {
        calculatorViewModel.onAction(CalculationAction.Number("1"))
        calculatorViewModel.onAction(CalculationAction.Number("2"))
        calculatorViewModel.onAction(CalculationAction.Nothing)

        Assert.assertEquals("12", calculatorViewModel.state.number1)
        Assert.assertEquals("", calculatorViewModel.state.number2)
        Assert.assertNull(calculatorViewModel.state.operation)
    }

}