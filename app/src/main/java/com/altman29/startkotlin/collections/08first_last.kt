package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: These functions return the first and the last element of the collection correspondingly.
 * You can also use them with a predicate; in this case, they return the first or the last element that matches the given predicate.
 */
val numbers8 = listOf(1, -2, 3, -4, 5, -6)            // 1

val first8 = numbers8.first()                          // 2
val last8 = numbers8.last()                            // 3

val firstEven8 = numbers8.first { it % 2 == 0 }        // 4
val lastOdd8 = numbers8.last { it % 2 != 0 }           // 5

fun main() {
    println("first: $first8")
    println("last: $last8")
    println("firstEven: $firstEven8")
    println("lastOdd: $lastOdd8")
}

/*
first、last找不到会NoSuchElementException
建议使用firstOrNull,lastOrNull， 引申： minOrNull, maxOrNull
 */