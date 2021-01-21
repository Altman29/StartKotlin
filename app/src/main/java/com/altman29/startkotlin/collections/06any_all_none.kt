package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: These functions check the existence of collection elements that match a given predicate(谓语).
 */

val t6numbers = listOf(1, -2, 3, -4, 5, -6)
val anyNegative = t6numbers.any { it < 0 }
val anyGT6 = t6numbers.any { it > 6 }

val n_allEven = t6numbers.none { it % 2 == 1 }
val n_nallLess6 = t6numbers.none { it > 6 }

val allEven = numbers.none { it % 2 == 1 }
val allLess6 = numbers.none { it > 6 }
fun main() {
    println("is there any number less than 0: $anyNegative")
    println("is there any number greater than 6: $anyGT6")

    println("all numbers are even(偶数): $allEven")
    println("all numbers are less than 6: $allLess6")

    println("All numbers are even : $n_allEven")
    println("No element greater than 6: $n_nallLess6")
}
