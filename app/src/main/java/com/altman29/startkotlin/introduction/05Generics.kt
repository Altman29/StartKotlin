package com.altman29.startkotlin.introduction

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Generics
 */

/*
Generics are a genericity mechanism that's become standard in modern languages. Generic classes and functions increase code
reusability by encapsulating common logic that is independent of a particular generic type, like the logic inside a List<T>
is independent of what T is.

泛型是一种泛型机制，已成为现代语言中的标准。 通用类和函数通过封装独立于特定通用类型的通用逻辑来提高代码的可重用性，例如List <T>内的逻辑与T无关。
 */

/*
The first way to use generics in Kotlin is creating generic classes.
 */

class MutableStack<E>(vararg items: E) {
    // stack : FILO First in Last out
    //    items.toMutableList() kotlin not allow right to left?  need member
    private val elements = items.toMutableList();

    //push peek pop size isEmpty
    fun push(element: E) = elements.add(element)
    fun peek(): E = elements.last() //返回栈顶元素
    fun pop(): E = elements.removeAt(elements.size - 1) //取出栈顶元素
    fun isEmpty() = elements.isEmpty() //左侧不需要声明返回类型，类型推断
    fun size() = elements.size
    override fun toString(): String {
        return "MutableStack (${elements.joinToString()})"
    }
}

fun main3() {
    val stack = MutableStack(2.1, 32.1, 21, 23, 3.13)
    stack.push(9.9)
    println(stack)

    println("stack peek(): ${stack.peek()}")
    println(stack)

    println("stack pop(): ${stack.pop()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("stack pop(): ${stack.pop()}")
        println(stack)
    }
}

/*
You can also generify functions if their logic is independent of a specific type. For instance, you can write a utility
function to create mutable stacks:

如果函数的逻辑与特定类型无关，则还可以生成函数。 例如，您可以编写一个实用程序函数来创建可变堆栈：
 */

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)// * 多参数

fun main() {
    //请注意，编译器可以从mutableStackOf的参数推断出通用类型，因此您不必编写mutableStackOf <Double>（...）。
    val stack = mutableStackOf("2Str", 3.2, 4.5, 7)
    println(stack)
}