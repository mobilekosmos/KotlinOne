package com.example.hellokotlin.delegates

fun main() {
    println(indexOfMax(intArrayOf(5, -5, 10, 0, 100, 7, 7)))
}

/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */
fun indexOfMax(a: IntArray): Int? {
    return if (a.isEmpty()) {
        null
    } else {
        val max = a.max()
        if (max != null) {
            a.indexOf(max)
        } else {
            null
        }
    }
}

fun indexOfMax2(a: IntArray): Int? = if (a.isEmpty()) {
    null
} else {
    val max = a.max()
    if (max != null) {
        a.indexOf(max)
    } else {
        null
    }
}

fun indexOfMax3(a: IntArray): Int? {
    return a.withIndex().maxBy { it.value }?.index
}