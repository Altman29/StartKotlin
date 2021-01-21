package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: flatMap transforms each element of a collection into an iterable object and builds a single
 * list of the transformation results. The transformation is user-defined.
 * flatMap将集合的每个元素转换为可迭代的对象，并构建转换结果的单个列表。 转换是用户定义的。
 */

val list = listOf(1, 2, 3)                        // 1

val tripledt = list.flatMap { listOf(it, "str$it", 4) } // 2
val tripledt1 = list.flatMap { setOf(it,it+1) } // 2

val list1 = listOf("123", "45")

fun main() {
    println("list: $list")
    println("tripledt: $tripledt")
    println("tripledt1: $tripledt1")
    println(list1.flatMap { it.toList() }) // [1, 2, 3, 4, 5]

}