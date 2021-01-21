package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc:count functions returns either the total number of elements in a collection or the number of elements
 * matching the given predicate.
 * count函数返回集合中元素的总数或与给定谓词匹配的元素数。
 */

//val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

val totalCount = numbers.count()                     // 2
val evenCount = numbers.count { it % 2 == 0 }        // 3

fun main() {
    println("totalCount: $totalCount")
    println("evenCount: $evenCount")
}

