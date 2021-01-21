package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: A set is an unordered collection that does not support duplicates. For creating sets, there are
 * functions setOf() and mutableSetOf(). A read-only view of a mutable set can be obtained by casting it to Set.
 */

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")//1

fun addIssue(uniqueDesc: String): Boolean {//2
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as dulicate and rejected."//3
}

fun main() {
    val aNewIssus: String = "uniqueDescr4"
    val anIssusAlreadyIn: String = "uniqueDescr2"

    println("Issus $aNewIssus ${getStatusLog(addIssue(aNewIssus))}")//4
    println("Issus $anIssusAlreadyIn ${getStatusLog(addIssue(anIssusAlreadyIn))}")//5
}

/*
1.Creates a Set with given elements.
2.Returns a boolean value showing if the element was actually added.
3.Returns a string, based on function input parameter.
4.Prints a success message: the new element is added to the Set.
5.Prints a failure message: the element can't be added because it duplicates an existing element.
 */