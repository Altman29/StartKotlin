package com.altman29.startkotlin.functions

/**
 * Created by Csy on 2021/1/20.
 * e-mail:altman29@foxmail.com
 * Desc: Extension Functions and Properties
 * 扩展功能和属性
 */
data class Item(val name: String, val price: Float)                                   // 1

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F    // 2
fun Order.minPricedItemValue(): Float = this.items.minBy { it.price }?.price ?: 1F

fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"
fun Order.minPricedItemName() = this.items.minBy { it.price }?.name ?: "ON_PRODUCTS"


val Order.commaDelimitedItemNames: String                                             // 3
    get() = items.map { it.name }.joinToString()

fun main2() {
    val order = Order(
        listOf(
            Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)
        )
    )
    println("Max priced item name: ${order.maxPricedItemName()}")                     // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Min priced item name: ${order.minPricedItemName()}")
    println("Min priced item name: ${order.minPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                // 5
}

/*
1.Defines simple models of Item and Order. Order can contain a collection of Item objects.
定义项目和订单的简单模型。 订单可以包含Item对象的集合。
2.Adds extension functions for the Order type.
为订单类型添加扩展功能。
3.Adds an extension property for the Order type.
为订单类型添加扩展属性。
4.Calls extension functions directly on an instance of Order.
直接在Order实例上调用扩展功能。
5.Accesses the extension property on an instance of Order.
访问Order实例的扩展属性。
 */

//It is even possible to execute extensions on null references. In an extension function,
// you can check the object for null and use the result in your code:
//甚至可以对空引用执行扩展。 在扩展功能中，您可以检查对象是否为null并在代码中使用结果：

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"
fun <T> T?.nullSafe() = this?.toString() ?: "NULLS"
fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
    println(null.nullSafe())
    println("Hello".nullSafe())
}