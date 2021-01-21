package com.altman29.startkotlin.controlflow

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: When
 * Instead of the widely used switch statement, Kotlin provides the more flexible and clear when construction.
 * It can be used either as a statement or as an expression.
 * Kotlin代替了广泛使用的switch语句，在构建时提供了更加灵活和清晰的提示。 它既可以用作语句，也可以用作表达式。
 */
fun main1() {
    cases(1)
    cases("Hello")
    cases(1L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("one")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}

class MyClass

//When Expression
fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3L))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> "Unknown"
    }
    return result
}