package com.example.hellokotlin.delegates

fun main() {
    println("aabbbbaa isPalindrome= " + isPalindrome("aabbbbaa"))
    println("abcdefgh isPalindrome= " + isPalindrome("abcdefgh"))
}

/*
 * Your task is to implement a palindrome test.
 *
 * A string is called a palindrome when it reads the same way left-to-right
 * and right-to-left.
 *
 * See http://en.wikipedia.org/wiki/Palindrome
 */

fun isPalindrome(s: String): Boolean {
    // Write your solution here
    return s == s.reversed()
}