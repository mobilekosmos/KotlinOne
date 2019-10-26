package com.example.hellokotlin.delegates

import kotlin.reflect.KProperty

fun main() {
    showMeTheHiddenMessage("Bond, James Bond 007")
}

// #15 Custom delegates
// Define a String variable that delegates the get and set function.

fun showMeTheHiddenMessage(message : String?) {
    if (message == "Bond, James Bond 007") {
        var msg by MyDelegate()
        println(msg)
        msg = "I don't accept the mission"
    }
}

class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "Hello Bond, your mission is to learn Kotlin."
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("You are not authorized to do this.")
    }
}