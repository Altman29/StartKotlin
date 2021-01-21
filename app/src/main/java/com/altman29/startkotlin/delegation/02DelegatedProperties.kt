package com.altman29.startkotlin.delegation

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc:Kotlin provides a mechanism of delegated properties that allows delegating the calls of the property set
 * and get methods to a certain object. The delegate object in this case should have the method getValue.
 * For mutable properties, you'll also need setValue.
 * Kotlin提供了一种委派属性的机制，该机制允许将属性集的调用委派给特定对象并获取方法。 在这种情况下，委托对象应具有方法getValue。
 * 对于可变属性，您还需要setValue。
 */
import kotlin.reflect.KProperty

class Example {

    var p: String by Delegate()                                               // 1

    override fun toString() = "Example Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        // 2
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { // 2
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main1() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
}

/*
1.Delegates property p of type String to the instance of class Delegate. The delegate object is defined after the by keyword.
将类型为String的属性p委托给类Delegate的实例。 委托对象在by关键字之后定义。
2.Delegation methods. The signatures of these methods are always as shown in the example. Implementations may contain any steps you need.
For immutable properties only getValue is required.
委托方法。 这些方法的签名始终如示例中所示。 实现可能包含您需要的任何步骤。 对于不可变属性，仅需要getValue。
 */



/*
Standard Delegates
The Kotlin standard library contains a bunch of useful delegates, like lazy, observable, and others. You may use them as is.
For example lazyis used for lazy initialization.
 */

class LazySample {
    init {
        println("created!")            // 1
    }

    val lazyStr: String by lazy {
        println("computed!")          // 2
        "my lazy"
    }
}

fun main2() {
    val sample = LazySample()         // 1
    println("lazyStr = ${sample.lazyStr}")  // 2
    println(" = ${sample.lazyStr}")  // 3
}
/*
1.Property lazy is not initialized on object creation.
创建对象时不会初始化惰性属性。
2.The first call to get() executes the lambda expression passed to lazy() as an argument and saves the result.
首次调用get（）会执行传递给lazy（）的lambda表达式作为参数，并保存结果。
3.Further calls to get() return the saved result.
进一步调用get（）返回保存的结果。

If you want thread safety, use blockingLazy() instead: it guarantees that the values will be computed only in one thread
and that all threads will see the same value.
如果需要线程安全，请改为使用blockingLazy（）：它保证仅在一个线程中计算值，并且所有线程将看到相同的值。
 */


/*
Storing Properties in a Map
Property delegation can be used for storing properties in a map. This is handy for tasks like parsing JSON
or doing other "dynamic" stuff.
属性委托可用于在Map中存储属性。 这对于诸如解析JSON或执行其他“动态”工作之类的任务非常方便。
 */

class User(val map: Map<String, Any?>) {
    val name: String by map                // 1
    val age: Int     by map                // 1
}

fun main() {
    val user = User(mapOf(
        "name" to "John Doe",//如果name (name1) 打错 ：Key name is missing in the map.
        "age"  to 25
    ))

    println("name = ${user.name}, age = ${user.age}")
}

/*
1.Delegates take values from the map by the string keys - names of properties.
代表通过字符串键（属性名称）从映射中获取值。

You can delegate mutable properties to a map as well. In this case, the map will be modified upon property assignments.
Note that you will need MutableMap instead of read-only Map.

您也可以将可变属性委派给地图。 在这种情况下，地图将根据属性分配进行修改。 请注意，您将需要MutableMap而不是只读Map。
 */