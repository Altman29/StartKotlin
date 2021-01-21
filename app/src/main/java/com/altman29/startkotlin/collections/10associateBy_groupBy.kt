package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc:Functions associateBy and groupBy build maps from the elements of a collection indexed by the specified key.
 * The key is defined in the keySelector parameter. You can also specify an optional valueSelector to define
 * what will be stored in the value of the map element.
 * associateBy 取最后一个匹配
 * groupBy  去所有匹配
 */


data class Person(val name: String, val city: String, val phone: String) // 1

val people = listOf(                                                     // 2
    Person("John", "Boston", "+1-888-123456"),
    Person("Sarah", "Munich", "+49-777-789123"),
    Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
    Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
)

val phoneBook = people.associateBy { it.phone }                          // 3
val cityBook = people.associateBy(Person::phone, Person::city)           // 4
val peopleCities = people.groupBy(Person::city, Person::name)            // 5

val peoleCitiesAsb = people.associateBy(Person::city, Person::name)  //去最后一个，第三个省略

fun main() {
    println("phoneBook: $phoneBook")
    println()
    println("cityBook: $cityBook")
    println()
    println("peopleCities: $peopleCities")
    println()

    println("peoleCitiesAsb: $peoleCitiesAsb")

}

//List 转Map、    对象装Map。  较常用。 参考下方链接
// https://zhaiyz.com/2018/07/30/Kotlin%E4%B8%ADList%E8%BD%ACMap%E7%9A%84%E5%B8%B8%E7%94%A8%E6%96%B9%E5%BC%8F/
