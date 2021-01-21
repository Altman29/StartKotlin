package com.altman29.startkotlin.scopefunctions

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: with is a non-extension function that can access members of its argument concisely: you can omit
 * the instance name when referring to its members.
 * with是一个非扩展函数，可以简洁地访问其参数的成员：在引用其成员时，可以省略实例名称。
 */

class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}