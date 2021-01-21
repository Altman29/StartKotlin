package com.altman29.startkotlin.scopefunctions

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: also works like apply: it executes a given block and returns the object called. Inside the block,
 * the object is referenced by it, so it's easier to pass it as an argument. This function is handy for embedding additional actions,
 * such as logging in call chains.
 * 也类似于apply：它执行给定的块并返回被调用的对象。 在该块内部，该对象被该对象引用，因此更容易将其作为参数传递。
 * 此功能非常适合嵌入其他操作，例如登录呼叫链。
 */
data class People(var name: String, var age: Int, var about: String) {
//    constructor() : this("", 0, "")
}

fun writeCreationLog(p: People) {
    println("A new person ${p.name} was created.")
}

fun main() {
    val jake = People("Jake", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
}

/*
在这里做一下总结，我们可以看出在这五个通用标准函数当中它们的特性也是十分的简单，无非也就是接收者和返回值的不同。
对于with,T.run,T.apply接收者是this，而T.let和T.also接受者是it；对于with,T.run,T.let返回值是作用域的最后一个对象（this）,
而T.apply和T.also返回值是调用者本身(itself)。
 */