package com.gio

fun main() {
    val fruits = setOf("Orange", "Apple", "Grape", "Apple", "Mango", "Orange")
    println(fruits.size)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits)
    println(newFruits.elementAt(4))


    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[1])

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[1] = "Friday"
    println(newDaysOfWeek)

    for(key in daysOfTheWeek.keys) {
        println(daysOfTheWeek[key])
    }

    val xili = mapOf<String, Xili>("vashli" to Xili("Apple", 2.3), "atami" to Xili("Peach", 3.3))
    println(xili.get("vashli"))
}

data class Xili(val name: String, val price: Double)