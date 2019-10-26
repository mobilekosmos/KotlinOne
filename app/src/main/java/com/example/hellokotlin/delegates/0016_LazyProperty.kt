package com.example.hellokotlin.delegates

import com.example.hellokotlin.delegates.showMeTheHiddenMessage

/**
 * Delegates.lazy() is a function that returns a delegate that implements a lazy property:
 * the first call to get() executes the lambda expression passed to lazy() as an argument
 * and remembers the result, subsequent calls to get() simply return the remembered result.
 * By default, the evaluation of lazy properties is synchronized: the value is computed
 * only in one thread, and all threads will see the same value. If the synchronization of
 * initialization delegate is not required, so that multiple threads can execute it
 * simultaneously, pass LazyThreadSafetyMode.PUBLICATION as a parameter to the lazy()
 * function. And if you're sure that the initialization will always happen on the same
 * thread as the one where you use the property, you can use LazyThreadSafetyMode.NONE:
 * it doesn't incur any thread-safety guarantees and the related overhead.
 */

fun main() {
    val lazy : String by lazy {
        println("5 minutes operation ended.")
        "The equation result is 5673"
    }

    println("Equation result= $lazy")
    println("Equation result= $lazy")
    println("Equation result= $lazy")
}