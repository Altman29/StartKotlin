package com.altman29.startkotlin.scopefunctions

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc:The Kotlin standard library function let can be used for scoping and null-checks. When called on an object,
 * let executes the given block of code and returns the result of its last expression. The object is accessible inside
 * the block by the reference it.
 * Kotlin标准库函数let可以用于作用域和null检查。 当在对象上调用时，let执行给定的代码块并返回其最后一个表达式的结果。 通过引用可以在块内部访问该对象。
 */

fun customPrint(s: String) {
    print(s.toUpperCase())
}


val empty = "test".let {               // 1
    customPrint(it)                    // 2
    it.isEmpty()                       // 3
}

fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {                         // 4
        print("\t")
        customPrint(it)
        println()
    }
}


fun main() {
    println(" is empty: $empty")
    //<可以得出，只要调用该val，赋值过程中的let会率先执行>

    printNonNull(null)
    printNonNull("my string")
}