package com.devamsba.calculatorapplication

import com.devamsba.calculatorapplication.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2 :String = "",
    val operation: CalculatorOperation? = null

)