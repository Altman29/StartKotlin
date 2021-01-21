package com.altman29.startkotlin.scopefunctions

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: apply executes a block of code on an object and returns the object itself. Inside the block, the object is referenced by this.
 * This function is handy for initializing objects.
 * apply在对象上执行代码块并返回对象本身。 在块内部，此对象被引用。 此功能对于初始化对象非常方便。
 */

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    val jake = Person()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }                                            // 4
    println(stringDescription)
}