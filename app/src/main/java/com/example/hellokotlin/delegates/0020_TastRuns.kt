package com.example.hellokotlin.delegates

fun main() {
    println("runs= " + runs(intArrayOf(1)))
}

/*
 * Any array may be viewed as a number of "runs" of equal numbers.
 * For example, the following array has two runs:
 *   1, 1, 1, 2, 2
 * Three 1's in a row form the first run, and two 2's form the second.
 * This array has two runs of length one:
 *   3, 4
 * And this one has five runs:
 *   1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0
 * Your task is to implement the runs() function so that it returns the number
 * of runs in the given array.
 */
fun runs(a: IntArray): Int {
    // Write your solution here
    var counter = 0
    var rounds = 0
    if (a.isEmpty()) {
        return rounds
    } else {
        rounds = 1
    }
    for (number in a) {
        println(number)
        if (a.size > counter + 1 && number != a[counter + 1]) {
            rounds++;
        }
        counter++;
    }
    return rounds
}

fun runs2(a: IntArray): Int {
    // Write your solution here
    var rounds = 0
    if (a.isEmpty()) {
        return rounds
    } else {
        rounds = 1
    }
    for ((counter, number) in a.withIndex()) {
        println(number)
        if (a.size > counter + 1 && number != a[counter + 1]) {
            rounds++;
        }
    }
    return rounds
}

fun runs3(a: IntArray): Int = if (a.isEmpty()) {
        0
    } else {
        var rounds = 1
        for ((counter, number) in a.withIndex()) {
            println(number)
            if (a.size > counter + 1 && number != a[counter + 1]) {
                rounds++;
            }
        }
        rounds
    }