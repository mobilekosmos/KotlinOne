package com.example.hellokotlin.koans

/*
Operators overloading
Implement a kind of date arithmetic. Support adding years, weeks and days to a date. You could be able to write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.

At first, add an extension function 'plus()' to MyDate, taking a TimeInterval as an argument. Use an utility function MyDate.addTimeIntervals() declared in DateUtil.kt

Then, try to support adding several time intervals to a date. You may need an extra class.
 */

private data class MyDate5(val year: Int, val month: Int, val dayOfMonth: Int)

private enum class TimeInterval { DAY, WEEK, YEAR }

private operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = TODO()

private fun task1(today: MyDate): MyDate {
    return today + TimeInterval.YEAR + TimeInterval.WEEK
}

private fun task2(today: MyDate): MyDate {
    TODO("Uncomment") //return today + YEAR * 2 + WEEK * 3 + DAY * 5
}