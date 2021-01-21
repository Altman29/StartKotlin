package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: find and findLast functions return the first or the last collection element that matches the given predicate.
 * If there are no such elements, functions return null.
 */

val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

val first = words.find { it.startsWith("some") }                                // 2
val last = words.findLast { it.startsWith("some") }                             // 3

val nothing = words.find { it.contains("nothing") }                             // 4

fun main() {
    println("first: $first")
    println("last: $last")
    println("nothing: $nothing")
}