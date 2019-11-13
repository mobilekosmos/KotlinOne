package com.example.hellokotlin.koans

import java.util.*

/*
For loop
Kotlin for loop iterates through anything that provides an iterator. Make the class DateRange implement Iterable<MyDate>, so that it could be iterated over. You can use the function MyDate.nextDay() defined in DateUtil.kt
 */

private class DateRange3(val start: MyDate17, val end: MyDate17): Iterable<MyDate17>{
    override fun iterator(): Iterator<MyDate17> = DateIterator(this)
}

private class DateIterator(private val dateRange:DateRange3) : Iterator<MyDate17> {
    var current: MyDate17 = dateRange.start
    override fun next(): MyDate17 {
        val result = current
        current = current.nextDay()
        return result
    }
    override fun hasNext(): Boolean = current <= dateRange.end
}

private fun iterateOverDateRange(firstDate: MyDate17, secondDate: MyDate17, handler: (MyDate17) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

private data class MyDate17(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate17> {
    override fun compareTo(other: MyDate17) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

private operator fun MyDate17.rangeTo(other: MyDate17) = DateRange3(this, other)

private fun MyDate17.nextDay() = addTimeIntervals(TimeInterval1.DAY, 1)

enum class TimeInterval1 {
    DAY,
    WEEK,
    YEAR
}

private fun MyDate17.addTimeIntervals(timeInterval: TimeInterval1, number: Int): MyDate17 {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)
    when (timeInterval) {
        TimeInterval1.DAY -> c.add(Calendar.DAY_OF_MONTH, number)
        TimeInterval1.WEEK -> c.add(Calendar.WEEK_OF_MONTH, number)
        TimeInterval1.YEAR -> c.add(Calendar.YEAR, number)
    }
    return MyDate17(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}