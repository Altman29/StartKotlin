package com.altman29.startkotlin.controlflow

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Kotlin 没有三元运算符，使用if
 */
fun max(a: Int, b: Int) = if (a > b) a else b         // 1


fun main() {
    println(max(99, -42))
}
