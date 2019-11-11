package com.example.hellokotlin.koans

/*
Object expressions
Read about object expressions that play the same role in Kotlin as anonymous classes in Java.

Add an object expression that provides a comparator to sort a list in a descending order using java.util.Collections class. In Kotlin you use Kotlin library extensions instead of java.util.Collections, but this example is still a good demonstration of mixing Kotlin and Java code.
 */

import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object : Comparator<Int> {
        override fun compare(p0: Int, p1: Int): Int {
            return p1 - p0
        }
    })
    return arrayList
}

fun getList2(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList) { p0, p1 -> p1 - p0 }
    return arrayList
}

fun getList3(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    arrayList.sortWith(Comparator { p0, p1 -> p1 - p0 })
    return arrayList
}

fun getList4(): List<Int> {
    return arrayListOf(1, 5, 2).sortedDescending()
}