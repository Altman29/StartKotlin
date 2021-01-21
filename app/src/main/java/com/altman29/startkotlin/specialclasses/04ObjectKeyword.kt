package com.altman29.startkotlin.specialclasses

import java.util.*

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Object Keyword 对象关键字. 与Java类似
 */
class LuckDispatcher {                    //1
    fun getNumber() {                     //2
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main2() {
    val d1 = LuckDispatcher()             //3
    val d2 = LuckDispatcher()

    d1.getNumber()                        //4
    d2.getNumber()
}

//object Expression 对象表达式，与Java中匿名内部类同理
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

    val dayRates = object {                                                     //2
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}

fun main3() {
    rentPrice(10, 2, 1)                                                         //5
}


//object Declaration 对象声明
object DoAuth {                                                 //1
    fun takeParams(username: String, password: String) {        //2
        println("input Auth parameters = $username:$password")
    }
}

fun main4() {
    DoAuth.takeParams("foo", "qwerty")
}

//Companion Objects 伴生对象   类似Java中静态方法
//类内的对象声明定义了另一个有用的情况：伴随对象。 从语法上讲，它类似于Java中的静态方法：您可以使用对象的类名作为限定符来调用对象成员。
//如果您打算在Kotlin中使用伴随对象，请考虑改用 包级函数。
class BigBen {
    companion object Bonger {//Bonger 可省略
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(3)
}

