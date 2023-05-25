package com.gio

fun main() {
//    val numbers: IntArray = intArrayOf(1,2,3,4,5,6)
//    val numbers = intArrayOf(1,2,3,4,5,6)
//    val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)
    println(numbers.contentToString())
    for(number in numbers) {
        print("${number + 2}")
    }
    // they are not changed
    println()
    for(number in numbers) {
        print("$number")
    }
    println()
    println(numbers[0])

    numbers[0] = 12
    println(numbers[0])

//    var doubleNumbers = doubleArrayOf(1.0, 2.0, 3.0)
    var doubleNumbers = arrayOf(1.0, 2.0, 3.0)
    doubleNumbers[0] = 5.0

    var strings = arrayOf("gio", "avto")
    strings[0] = "Gis"

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    println(fruits.contentToString())
    println(fruits[0].name)
    for(index in fruits.indices) {
        println("${fruits[index].name} is in index $index")
    }
    for(fruit in fruits) {
        println(fruit.name)
    }

    val days = arrayOf("Sun", 2, "Mon", Fruit("Apple", 2.5))
    println(days.contentToString())
}

data class Fruit(val name: String, val price: Double)
