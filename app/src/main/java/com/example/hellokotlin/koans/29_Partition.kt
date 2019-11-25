package com.example.hellokotlin.koans

/*
Partition
Implement Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered() using partition.

val numbers = listOf(1, 3, -4, 2, -11)
val (positive, negative) = numbers.partition { it > 0 }
positive == listOf(1, 3, 2)
negative == listOf(-4, -11)
Note that destructuring declaration syntax is used in this example.
 */

// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =
    customers.filter {
        val (delivered, notDelivered) = it.orders.partition{it.isDelivered }
        delivered.size < notDelivered.size
    }.toSet()