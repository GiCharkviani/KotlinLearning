package com.gio

fun main() {
    val months = listOf("January", "February", "March")
    val anyTypes = listOf("1", 3, true)
//    println(anyTypes.size)
//    println(months[1])

    for(month in months) {
        println(month)
    }

    // convert into mutable list
    val additionalMonths = months.toMutableList()
    additionalMonths.add(3, "April")
    val newMonths = arrayOf("May", "June", "July")
    additionalMonths.addAll(newMonths)
    additionalMonths[6] = "August"

    println(additionalMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days.removeAt(2)
    days.removeAll(days)
    println(days)
}