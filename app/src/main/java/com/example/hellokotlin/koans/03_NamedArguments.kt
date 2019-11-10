package com.example.hellokotlin.koans

fun main() {
    println(joinOptions(listOf("1", "3")))
}

fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")