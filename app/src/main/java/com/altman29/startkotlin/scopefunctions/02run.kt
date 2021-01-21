package com.altman29.startkotlin.scopefunctions

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: Like let, run is another scoping function from the standard library. Basically, it does the same:
 * executes a code block and returns its result. The difference is that inside run the object is accessed by this.
 * This is useful when you want to call the object's methods rather than pass it as an argument.
 * 就像let一样，run是标准库中的另一个作用域函数。 基本上，它执行相同的操作：执行一个代码块并返回其结果。 <区别>在于，内部运行可由此访问对象。
 * 当您要调用对象的方法而不是将其作为参数传递时，这很有用。length(),subString,等等，对象的方法可以直接使用，let不行。
 */

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                                  // 1
            println("\tis empty? " + isEmpty())                    // 2
            println("\tlength = $length")
            length                                   // 3 run returns the length of the given String if it's not null.
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}