package com.gio

import kotlin.math.floor


abstract class Human(private val name: String, private val surname: String, private val age: Int) {

    abstract fun run()
    abstract val hobby: String

    fun scream() {
        println("Screaming")
    }
}



fun main() {
    val stringList: List<String> = listOf(
        "Dennis", "Frank", "Michael", "Garry"
    )

    val mixedTypeList: List<Any> = listOf(
        "Dennis", 3, 5, "Frank", 70.4,"Michael", "Garry"
    )

    for (value in mixedTypeList) {
        if (value is Int) {
            println("Integer: '$value'")
        } else if (value is Double) {
            println("Double: '$value' with Floor value ${floor(value)}")
        } else if(value is String) {
            println("String: '$value' of length ${value.length}")
        } else println("Unknown Type")
    }

    // alternatively
    for (value in mixedTypeList) {
        when(value) {
            is Int -> println("Integer: '$value'")
            is Double -> println("Double: '$value' with Floor value ${floor(value)}")
            is String -> println("String: '$value' of length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    // SMART CAST
    val obj1: Any = "I have a dream"
    if(obj1 !is String) {
        println("Not a String")
    } else {
        // obj is automatically cast to a String in this scope
        println("Found a string of length ${obj1.length}")
    }

    // Explicit (unsafe) Casting using the "as" keyword = can go wrong
    val str1: String = obj1 as String
    println(str1.length)

    val obj2: Any = 1237
    val str2: String? = obj2 as? String
    println(str2) // will print null, because it can't cast integer to string

    // Explicit (safe) casting using the "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String // works
    println(str3) // prints null
}