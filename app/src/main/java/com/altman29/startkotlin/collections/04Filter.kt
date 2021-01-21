package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: filter function enables you to filter collections. It takes a filter predicate as a lambda-parameter.
 * The predicate is applied to each element. Elements that make the predicate true are returned in the result collection.
 * 过滤器功能使您可以过滤集合。 它使用一个过滤谓词作为lambda参数。 谓词应用于每个元素。 使谓词为真的元素将在结果集合中返回。
 */

val numbers = listOf(1, -2, 3, -4, 5, -6)       //1

val positives = numbers.filter { x -> x > 0 }   //2

val negatives = numbers.filter { it < 0 }       //3

fun main() {
    println("positives: $positives")
    println("negatives: $negatives")
}