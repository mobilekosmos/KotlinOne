package com.example.hellokotlin.koans

/*
Extension functions
Read about extension functions. Then implement extension functions Int.r() and Pair.r() and make them convert Int and Pair to RationalNumber.
TODO: task is not really clear :/
 */

fun Int.r(): RationalNumber = TODO()
fun Pair<Int, Int>.r(): RationalNumber = TODO()

data class RationalNumber(val numerator: Int, val denominator: Int)