package com.altman29.startkotlin.introduction

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

/**
 * Created by Csy on 2021/1/20.
 * e-mail:s1yuan_chen@163.com
 * Desc: Variables
 */

/*
Kotlin has powerful type inference. While you can explicitly declare the type of a variable,
you'll usually let the compiler do the work by inferring it. Kotlin does not enforce immutability,
though it is recommended.
Kotlin具有强大的类型推断功能。 虽然可以显式声明变量的类型，但通常可以让编译器通过推断变量来完成工作。 尽管建议这样做，
但Kotlin不会强制执行不变性。
mutable 易变的(var)
immutable 不可变的(val)
 */

var a: String = "init"
val b: Int = 3
val c = 4
//var e:Int //Property must be initialized

//You're free to choose when you initialize a variable, however, it must be initialized before the first read.


fun main() {
    val d: Int

    @RequiresApi(Build.VERSION_CODES.O)
    if (LocalDateTime.now().hour > 5) {
        d = 4
    } else {
        d = 5
    }

    println(a)
    println(b)
    println(c)
    println("$d dada")
}

