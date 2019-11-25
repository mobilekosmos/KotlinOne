package com.example.hellokotlin.koans

/*
Group By
Implement Shop.groupCustomersByCity() using groupBy.

val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }
result == mapOf(1 to listOf("a", "b"), 2 to listOf("ba", "ad"), 3 to listOf("ccc"))
 */
// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy{it.city}

fun main() {
    val numbers = listOf(1, 3, -4, 2, -11)

    //val myLambda = {number:Int -> number > 0}
    val myLambda : (Int)->Boolean = {number:Int -> number > 0}

    val (positive, negative) = numbers.partition { it > 0 }
    val (positive2, negative2) = numbers.partition(myLambda)

    println(positive)
    println(negative)
    println(positive2)
    println(negative2)
}
