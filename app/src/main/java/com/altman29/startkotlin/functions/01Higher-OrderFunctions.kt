package com.altman29.startkotlin.functions

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Higher-Order Functions
 * A higher-order function is a function that takes another function as parameter and/or returns a function.
 */

//Taking Functions as Parameters
//声明一个高阶函数。 它采用两个整数参数x和y。 此外，它将另一个函数操作作为参数。 声明中还定义了操作参数和返回类型。
//高阶函数使用提供的参数返回操作调用的结果。
fun calculate(x: Int, y: Int, operators: (Int, Int) -> Int) = operators(x, y)

//声明一个与operation签名匹配的函数。
fun sum(x: Int, y: Int) = x + y

fun main1() {
    //调用传递两个整数值和函数参数:: sum的高阶函数。 ::是在Kotlin中按名称引用函数的表示法。
    val sumResult = calculate(3, 4, ::sum)              //7
    //调用传入lambda作为函数参数的高阶函数。根sum 无关
    val mulResult = calculate(3, 4) { a, b -> a * b }   //12
    println("sumResult $sumResult, mulResult $mulResult")
}


//Returning Functions   返回函数
fun operation(): (Int) -> Int {                                     // 1
    return ::square
}

fun sumAll(i: Int): Int = i + i

fun square(x: Int) = x * x                                          // 2

fun main() {
    val func = operation()                                          // 3
    println(func(3))                                                // 4
}