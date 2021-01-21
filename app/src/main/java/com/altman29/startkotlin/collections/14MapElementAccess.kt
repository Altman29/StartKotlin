package com.altman29.startkotlin.collections

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: When applied to a map, [] operator returns the value corresponding to the given key, or null if there is no such key in the map.
 * 应用于Map时，[]运算符将返回与给定键对应的值；如果Map中没有此类键，则返回null。
 *
 * getValue function returns an existing value corresponding to the given key or throws an exception if the key wasn't found.
 * For maps created with withDefault, getValue returns the default value instead of throwing an exception.
 * getValue函数返回与给定键相对应的现有值，如果找不到键，则引发异常。 对于使用withDefault创建的地图，getValue返回默认值，而不是引发异常。
 */


val map = mapOf("key" to 42)

val value1 = map["key"]                                     // 1
val value2 = map["key2"]                                    // 2

val value3: Int = map.getValue("key")                       // 1

val mapWithDefault = map.withDefault { k -> k.length }
val value4 = mapWithDefault.getValue("key2")                // 3

fun main() {
    try {
//        println(value1)
//        println(value2)
//        println(value3)
        println(value4)

        map.getValue("key2")
        println(map.getValue("key2"))

        mapWithDefault.getValue("anotherKey")
        println(mapWithDefault.getValue("anotherKey"))

    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }

}