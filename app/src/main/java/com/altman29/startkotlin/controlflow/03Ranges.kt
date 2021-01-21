package com.altman29.startkotlin.controlflow

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Ranges
 * There is a set of tools for defining ranges in Kotlin
 * Kotlin中有一组用于定义范围的工具。
 */
fun main() {
    for (i in 0..3) print("i: {$i} ")//包含头，包含尾
    println()

    for (i in 0 until 3) print("i: {$i} ") //包含头，不包含尾
    println()

    for (i in 2..8 step 2) print("i: {$i} ") //包含头，包含尾，增量为2
    println()

    for (i in 3 downTo 0) print("i: {$i} ")// 3->0 包含头尾
    println()

    //Char ranges are also supported:
    for (c in 'a'..'d') print(c)
    println()

    for (c in 'z' downTo 's' step 2) print(c)
    println()

    //Ranges are also useful in if statements:
    val x = 5
    if (x in 1..5) print("x is in range from 1 to 5")
    println()

    if (x !in 6..10) print("x is not in range from 6 to 10")
    println()


}