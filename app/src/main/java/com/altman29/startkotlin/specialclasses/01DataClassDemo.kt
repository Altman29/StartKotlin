package com.altman29.startkotlin.specialclasses

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: DataClass
 * Data classes make it easy to create classes that are used to store values. Such classes are automatically
 * provided with methods for copying, getting a string representation, and using instances in collections.
 * 数据类使创建用于存储值的类变得容易。 此类自动提供了用于复制，获取字符串表示形式以及在集合中使用实例的方法。
 */
data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")   // 3
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())                               // 4
    println(thirdUser.hashCode())

    // copy() function Auto-generated copy function makes it easy to create a new instance.
    //自动生成的复制功能使创建 新实例 变得容易。
    println(user.copy())                                   // 5
    println(user.copy("Max"))                       // 6    User(name=Max, id=1)
    println(user.copy(id = 2))                             // 7    User(name=Alex, id=2)

    //copy不改变source
    //Auto-generated componentN functions let you get the values of properties in the order of declaration.
    println("name = ${user.component1()}")                 // 8
    println("id = ${user.component2()}")
}
