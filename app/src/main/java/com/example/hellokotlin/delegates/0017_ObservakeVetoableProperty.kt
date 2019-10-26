package com.example.hellokotlin.delegates

import kotlin.properties.Delegates

/**
 * The observable() function takes two arguments: initial value and a handler for modifications.
 * The handler gets called every time we assign to `name`, it has three parameters:
 * a property being assigned to, the old value and the new one. If you want to be able to veto
 * the assignment, use vetoable() instead of observable().
 */

fun main() {
    //demoObservableProperty()
    demoVetoableProperty()
}

private fun demoObservableProperty() {
    var name: String by Delegates.observable("Initial value")
    {
        _, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }

    name = "1"
    name = "2"
    name = "3"
}

/**
 * If you want to intercept assignments and "veto" them, use vetoable() instead of
 * observable(). The handler passed to the vetoable is called before the assignment
 * of a new property value has been performed.
 */
private fun demoVetoableProperty() {
    var name: String by Delegates.vetoable("0") {
        property, oldValue, newValue ->
        println("Property name: ${property.name}: $oldValue -> $newValue")
        newValue.length < 2
    }

    println("$name")
    name = "10"
    println("$name")
    name = "9"
    println("$name")
    name = "8"
    println(name)
    name = "7"
    println(name)
    name = "-1"
    println(name)
    name = "-11"
    println(name)
}