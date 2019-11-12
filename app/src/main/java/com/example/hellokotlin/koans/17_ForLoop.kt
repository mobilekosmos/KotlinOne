package com.example.hellokotlin.koans

/*
For loop
Kotlin for loop iterates through anything that provides an iterator. Make the class DateRange implement Iterable<MyDate>, so that it could be iterated over. You can use the function MyDate.nextDay() defined in DateUtil.kt
 */

class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> = DateIterator(this)
}

class DateIterator(val dateRange:DateRange) : Iterator<MyDate> {
    var current: MyDate = dateRange.start
    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }
    override fun hasNext(): Boolean = current <= dateRange.end
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}