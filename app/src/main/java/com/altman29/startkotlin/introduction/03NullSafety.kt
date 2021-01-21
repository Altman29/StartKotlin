package com.altman29.startkotlin.introduction

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Null Safety
 */

/*
In an effort to rid the world of NullPointerException, variable types in Kotlin don't allow the assignment of null.
If you need a variable that can be null, declare it nullable by adding ? at the end of its type.

为了摆脱NullPointerException的世界，Kotlin中的变量类型不允许分配null。 如果您需要一个可以为null的变量，
请通过添加？将其声明为可为空。 在其类型的末尾。

 */

var neverNull: String = "This can't be null" //成员属性

var inferredNonNull = "The compiler assumes non-null"//编译器类型推断non-null

fun strLength(nonNull: String): Int {
    return nonNull.length
}

fun main2() {
    var nullAble: String? = "This can keep null" //局部属性

    //neverNull = null //Null can not be a value of a non-null type String

    nullAble = null // no error

    //inferredNonNull = null //Null can not be a value of a non-null type String

    val strLength = strLength("The String content")

    strLength(neverNull)
    //strLength(nullAble) //传入可空 会报错

    if (nullAble != null) {//可用try-catch
        strLength(nullAble)
    }


}

/*
 Sometimes Kotlin programs need to work with null values, such as when interacting with external
 Java code or representing a truly absent state. Kotlin provides null tracking to elegantly deal with such situations.
 有时Kotlin程序需要使用空值，例如与外部Java代码进行交互或表示真正的缺席状态时。 Kotlin提供null跟踪以优雅地处理此类情况。

 public inline fun CharSequence.isNotEmpty(): Boolean = length > 0

 */

fun describeString(maybeString: String?): String {
    return if (maybeString != null && maybeString.isNotEmpty()) "String of length ${maybeString.length}"
    else "Empty or null string"
}


fun main() {
    println(describeString("Hello kotlin"))
}