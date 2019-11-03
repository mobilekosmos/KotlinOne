package com.example.hellokotlin.delegates

fun main() {
    println(findPairless(intArrayOf(1, 2, 1, 2)))
    println(findPairless(intArrayOf(1, 1, 1)))
}

/*
 * Think of a perfect world where everybody has a soulmate.
 * Now, the real world is imperfect: there is exactly one number in the array
 * that does not have a pair. A pair is an element with the same value.
 * For example in this array:
 *   1, 2, 1, 2
 * every number has a pair, but in this one:
 *   1, 1, 1
 * one of the ones is lonely.
 *
 * Your task is to implement the findPairless() function so that it finds the
 * lonely number and returns it.
 *
 * A hint: there's a solution that looks at each element only once and uses no
 * data structures like collections or trees.
 */

fun findPairless(a: IntArray): Int = a.fold(0, {accum, x -> accum xor x})