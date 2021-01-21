package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: The partition function splits the original collection into a pair of lists using a given predicate
 * 分区函数使用给定的谓词将原始集合拆分为一对列表
 * Elements for which the predicate is true.  谓词为真的元素。
 * Elements for which the predicate is false. 谓词为假的元素。
 */
val numbers11 = listOf(1, -2, 3, -4, 5, -6)                // 1

val evenOdd = numbers11.partition { it % 2 == 0 }           // 2
val postiveNegative = numbers11.partition { it > 0 } // 3

fun main() {
    println("number: $numbers11")
    println("evenOdd.first: ${evenOdd.first} , evenOdd.second: ${evenOdd.second}")
    println("postiveNegative.first: ${postiveNegative.first}, postiveNegative.second:  ${postiveNegative.second}")

}
/*
number: [1, -2, 3, -4, 5, -6]
evenOdd.first: [-2, -4, -6] , evenOdd.second: [1, 3, 5]
postiveNegative.first: [1, 3, 5], postiveNegative.second:  [-2, -4, -6]
 */