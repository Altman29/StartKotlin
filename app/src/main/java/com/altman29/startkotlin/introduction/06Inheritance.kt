package com.altman29.startkotlin.introduction

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc:Inheritance
 */

/*
Kotlin fully supports the traditional object-oriented inheritance mechanism.
Kotlin完全支持传统的面向对象的继承机制。
 */

open class Dog {
    open fun sayHello() {
        println("wow wow")
    }
    /*
    Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
    默认情况下，Kotlin类是final。 如果要允许类继承，请使用open修饰符标记该类。

    Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
    默认情况下，Kotlin方法也是最终的。 与类一样，open修饰符允许覆盖它们。
     */
}

/*
A class inherits a superclass when you specify the : SuperclassName() after its name. The empty parentheses () indicate
an invocation of the superclass default constructor.
当您在类名称后指定：SuperclassName（）时，类将继承超类。 空括号（）表示对超类默认构造函数的调用。Overriding methods or attributes requires the override modifier.

 */
class Yorkshire : Dog() {
    override fun sayHello() {//Overriding methods or attributes requires the override modifier(修饰符).
        println("wif wif")
    }
}

fun main4() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}


//Inheritance with Parameterized Constructor 参数化构造函数的继承

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A Tiger from $origin says: grrhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

fun main5() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
    println(tiger.origin)
}


//Passing Constructor Arguments to Superclass 将构造函数参数传递给超类


open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "Asia")

fun main() {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}