package com.example.hellokotlin.delegates

fun main() {
    println("aabbbbaa isPalindrome= " + isPalindrome("aabbbbaa"))
    println("abcdefgh isPalindrome= " + isPalindrome("abcdefgh"))
}

fun isPalindrome(s: String): Boolean {
    // Write your solution here
    return s == s.reversed()
}