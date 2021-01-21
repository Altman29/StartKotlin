package com.altman29.startkotlin.specialclasses

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Sealed Classes
 * Sealed classes let you restrict the use of inheritance. Once you declare a class sealed,
 * it can only be subclassed from inside the same file where the sealed class is declared.
 * It cannot be subclassed outside of the file where the sealed class is declared.
 * 密封类允许您限制继承的使用。 声明密封的类之后，只能从声明密封的类的 同一文件 内部对其进行子类化。 不能在声明密封类的文件之外对它进行子类化。
 * Sealed Classes 用于表示受限制的类层次结构，可以是说是枚举类的扩展，有抽象类的开放性，有枚举类的局限性
 * sealed class Color {
 * class Red(val value: Int) : Color()
 * class Green(val value: Int) : Color()
 * class Blue(val name: String) : Color()
 * }
 *
 * Sealed Classes 的子类可以表示不同状态的实例
 * sealed class PokemonResult<out T> {
 *      data class Success<out T>(val value: T) : PokemonResult<T>()
 *      data class Failure(val throwable: Throwable?) : PokemonResult<Nothing>()
 * }
 *
 * 另外一个例子，在一个列表中可能会有不同类型的数据，比如图片、文本等等，那么用 Sealed Classes 如何表示。
 * sealed class ListItem {
 *      class Text(val title: String, val content: String) : ListItem()
 *      class Image(val url: String) : ListItem()
 * }
 */
sealed class Mammal(val name: String)
class Cat(catName: String) :
    Mammal(catName)//Defines subclasses. Note that all subclasses must be in the same file.

class Human(humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working at ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
    //The else-case is not necessary here since all possible subclasses of the sealed class are covered.
    // With a non-sealed superclass else would be required.
}

fun main() {
    println(greetMammal(Human("Alex", "Zoo")))
}
