package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: map extension function enables you to apply a transformation to all elements in a collection.
 * It takes a transformer function as a lambda-parameter.
 */

val test5 = listOf(1, -2, 3, -4, 5, -6)

val doubled = test5.map { c -> c * 2 }

val tripled = test5.map { c -> c * 3 }

fun main() {
    println("doubled: $doubled")
    println("tripled: $tripled")
}