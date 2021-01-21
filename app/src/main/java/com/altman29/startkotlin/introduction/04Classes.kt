package com.altman29.startkotlin.introduction

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Classes
 */

/*
 The class declaration consists of the class name, the class header (specifying its type parameters,
 the primary constructor etc.) and the class body, surrounded by curly braces. Both the header and the body are optional;
 if the class has no body, curly braces can be omitted.
类声明由类名，类头（指定其类型参数，主构造函数等）和类主体（由花括号包围）组成。 标头和正文都是可选的； 如果该类没有正文，则可以省略花括号。
 */

/**
 * Declares a class named Customer without any properties or user-defined constructors.
 * A non-parameterized default constructor is created by Kotlin automatically.
 */
class Customer

/**
 * Declares a class with two properties: immutable id and mutable email, and a constructor with two parameters id and email.
 */
class Contract(val id: Int, var email: String)

fun main() {
    /*
    Creates an instance of the class Customer via the default constructor. Note that there is no new keyword in Kotlin.
     */
    val customer = Customer()

    /*
    Creates an instance of the class Contact using the constructor with two arguments.
     */
    val contract = Contract(1, "altman29@foxmail.com")
    println(contract.id)//Accesses the property id.

    contract.email="update@gmail.com"//Updates the value of the property email.

}