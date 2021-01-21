package com.altman29.startkotlin.introduction

/**
 * Created by Csy on 2021/1/19.
 * e-mail:s1yuan_chen@163.com
 * Desc: Kotlin Hello World & Functions
 * 属性声明，方法声明，自定义操作符，自定义函数
 */

fun main1() {
//    print("Hello Kotlin")
//    printMsg("Hello Msg")
//    printMsgWithPrefix("msg", "log")
//    println(sum(3, 4))
//    println(multiply(3, 4))

    //中缀扩展 扩展函数
    infix fun Int.times(str: String) = str.repeat(this)
    println(3 times "Bye ")

    //get a pair(k:v) quickly
    val pair = "Ferrari" to "Katrina"
    println(pair)

    //创建自己都函数实现(onNext)
    infix fun String.onNext(str: String) = Pair(this, str)
    val myPair = "McLaren" onNext "Lucas"
    println(myPair)

    //Infix notation also works on members functions
    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}


fun printMsg(msg: String): Unit {
    println(msg)
}

fun printMsgWithPrefix(msg: String, preFix: String = "Info") {
    println("[$preFix] $msg")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y


class Person(val name: String) {
    private val likePeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likePeople.add(other)
    }
}


fun main() {

    infix fun Int.time(str: String) = str.repeat(this)
    println(3 time "Bye ")

    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

    fun printAll(vararg str: String) {
        for (m in str) print("$m ")
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")


    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix(
        "Hello", "Hallo", "Salt", "Hole", "你好",
        prefix = "Greeting: "
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }

    log("str1", "str2", "str3", "str4")
}