package com.altman29.startkotlin.controlflow

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Kotlin supports all the commonly used loops: for, while, do-while
 */

//for
val cakes = listOf("carrot", "chees", "chocolate")
fun main2() {
    for (cake in cakes) println("Yummy,it's a $cake cake.")
}

//while and do-while
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")
fun main3() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {                    // 1
        eatACake()
        cakesEaten++
    }

    do {                                        // 2
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}

//Iterators
class Animal(val name: String)
class Zoo(private val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val zoo: Zoo = Zoo(listOf(Animal("tiger"), Animal("wolf")))
    for (animal in zoo) println("animal in zoo contains: ${animal.name}")
}