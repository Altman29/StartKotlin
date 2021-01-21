package com.altman29.startkotlin.specialclasses

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Enum
 * Enum classes are used to model types that represent a finite set of distinct values, such as directions,
 * states, modes, and so forth.
 * 枚举类用于对表示有限的一组不同值的类型进行建模，例如方向，状态，模式等。
 */
enum class State {
    IDLE, RUNNING, FINISHED
}

fun main1() {
    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
        //使用枚举，编译器可以推断出when-expression是否详尽无遗，因此您不需要else-case。
        //else -> "Unknown"
    }
    println(message)

    //Enums may contain properties and methods like other classes, separated from the list of instances by a semicolon.
    //枚举可能包含与其他类一样的属性和方法，用分号将其与实例列表分开。

}

enum class Color(val rgb: Int) {                      // 1
    RED(0xFF0000),                                    // 2
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3
}

fun main() {
    val red = Color.RED
    println(red)                                      // 4
    println(red.containsRed())                        // 5
    println(Color.BLUE.containsRed())                 // 6
}