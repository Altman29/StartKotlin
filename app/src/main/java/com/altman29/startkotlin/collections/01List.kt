package com.altman29.startkotlin.collections

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: List
 * A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList)
 * or read-only (List). For list creation, use the standard library functions listOf() for read-only lists
 * and mutableListOf() for mutable lists. To prevent unwanted modifications, obtain read-only views of mutable lists
 * by casting them to List.
 */

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSudoer(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSudoer(4)
    println("Tot sudoers: ${systemUsers.size}")
    getSysSudoers().forEach { it -> println("some useful into on user $it") }//Iterable的对象可以调用forEach
    //getSysSudoers().add(5) // error!
}