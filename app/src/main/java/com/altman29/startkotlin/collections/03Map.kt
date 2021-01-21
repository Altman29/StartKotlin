package com.altman29.startkotlin.collections

import android.os.Build
import androidx.annotation.RequiresApi

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value.
 * For creating maps, there are functions mapOf() and mutableMapOf(). Using the to infix function makes initialization less noisy.
 * A read-only view of a mutable map can be obtained by casting it to Map.
 */

const val POINT_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)//1
val EZPassReport: Map<Int, Int> = EZPassAccounts              //2

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {        //3
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINT_X_PASS     //4
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

@RequiresApi(Build.VERSION_CODES.N)
fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { (k, v) -> println("ID $k: credit $v") }        //5
}

@RequiresApi(Build.VERSION_CODES.N)
fun main1() {
    accountsReport()                    //6
    updatePointsCredit(1)       //7
    updatePointsCredit(1)
    updatePointsCredit(5)       //8
    accountsReport()                    //9
    println("map[k]: ${EZPassAccounts[1]}")
    addToMutableMap()
//    mutableMapReport()

}

/*
1.Creates a mutable Map.
2.Creates a read-only view of the Map.
3.Checks if the Map's key exists.
4.Reads the corresponding value and increments it with a constant value.
5.Iterates immutable Map and prints key/value pairs.
6.Reads the account points balance, before updates.
7.Updates an existing account two times.
8.Tries to update a non-existing account: prints an error message.
9.Reads the account points balance, after updates.
 */


var mutableMap: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)

fun mutableMapReport(map: Map<Int, Int>) {
    println("EZ-Pass-Mutable report:")
    map.forEach { (k, v) -> println("ID $k: credit $v") }
}

fun addToMutableMap(): Map<Int, Int> {
    mutableMap[4] = 100
    return mutableMap.plus(5 to 100)
}

//plus 返回一个更新过的Map，put 添加元素到map  但 推荐 mutableMap[4] = 100 写法
fun main() {
    mutableMapReport(mutableMap)
    val plus = addToMutableMap()
    mutableMapReport(mutableMap)
    mutableMapReport(plus)
}

