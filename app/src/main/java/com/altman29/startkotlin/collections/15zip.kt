package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc:zip function merges two given collections into a new collection. By default, the result collection contains
 * Pairs of source collection elements with the same index. However, you can define own structure of the result collection element.
 * zip函数将两个给定的集合合并到一个新的集合中。 默认情况下，结果集合包含具有相同索引的成对的源集合元素。 但是，您可以定义结果收集元素的自身结构。
 */

val A = listOf("a", "b", "c")                  // 1
val B = listOf(1, 2, 3, 4)                     // 1

val resultPairs = A zip B                      // 2
val resultReduce = A.zip(B) { a, b -> "$a$b" } // 3
val resultReduce1 = B.zip(A) { a, b -> "$a$b" } // 3
val resultReduce2 = B.zip(A) { a, b -> "$a$b"+1 } // 3

fun main() {
    println("A zip B: $resultPairs")
    println("A.zip(b): $resultReduce")
    println("B.zip(A): $resultReduce1")
    println("B.zip(A): $resultReduce2")
}