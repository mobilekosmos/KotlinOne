package com.example.hellokotlin.koans

/*
Comparison
Read about operator overloading to learn how different conventions for operations like ==, <, + work in Kotlin. Add the function compareTo to the class MyDate to make it comparable. After that the code below date1 < date2 will start to compile.

In Kotlin when you override a member, the modifier override is mandatory.
 */

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }

}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2