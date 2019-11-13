package com.example.hellokotlin.koans

/*
Destructuring declarations
Read about destructuring declarations and make the following code compile by adding one word.
 */

data class MyDate6(val year: Int, val month: Int, val dayOfMonth: Int)

private fun isLeapDay(date: MyDate6): Boolean {

    val (year, month, dayOfMonth) = date

    // 29 February of a leap year
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}