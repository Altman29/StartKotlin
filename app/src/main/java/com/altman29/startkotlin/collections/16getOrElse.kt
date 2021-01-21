package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc:getOrElse provides safe access to elements of a collection. It takes an index and a function that provides the
 * default value in cases when the index is out of bound.
 * getOrElse提供对集合元素的安全访问。 当索引超出范围时，它需要一个索引和一个提供默认值的函数。
 */
fun main() {
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })    // 1
    println(list.getOrElse(10) { 42 })   // 2

    //getOrElse can also be applied to Map to get the value for the given key.
    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 })       // 1

    map["x"] = 3
    println(map.getOrElse("x") { 1 })       // 2

    map["x"] = null
    println(map.getOrElse("x") { 1 })       // 3


}