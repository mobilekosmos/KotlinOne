package com.example.hellokotlin.delegates

fun main() {
    println(sum(intArrayOf(1, 2, 3)))
    println(sum2(intArrayOf(1, 2, 3)))
}

/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */
fun sum(a: IntArray): Int {
    // Write your solution here
    var total = 0
    a.forEach { i -> total += i }
    return total
}

fun sum2(a: IntArray): Int {
    // Write your solution here
    return a.sum()
}