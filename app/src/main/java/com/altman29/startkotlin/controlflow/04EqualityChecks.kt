package com.altman29.startkotlin.controlflow

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Equality Checks
 * Kotlin uses == for structural comparison and === for referential comparison.
 */
fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // true ，比较俩个对象的值,因为是set，所以存储后顺序是一样的,如果是listOf,返回false
    //Returns true because it calls authors.equals(writers) and sets ignore element order.

    println(authors === writers)  // false 因为是不同的引用 比较俩个对象的地址
    //Returns false because authors and writers are distinct references.
}