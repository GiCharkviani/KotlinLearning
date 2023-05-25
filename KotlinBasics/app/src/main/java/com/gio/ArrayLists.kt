package com.gio

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    for (i in arrayList) {
//        println(i)
    }

    val list1: ArrayList<String> = ArrayList<String>(5)
    val list2: MutableList<String> = mutableListOf<String>()
    list2.add("One")
    list2.add("Two")
    list1.addAll(list2)

    println(list1)

    val itr = list1.iterator()
    while (itr.hasNext()) {
        println(itr.next())
    }
    println(arrayList[1])

    val exercise = ArrayList<Double>(5)
    val accepts = listOf<Double>(4.2,1.3,2.5,3.4,4.7)
    exercise.addAll(accepts)

    var sum: Double = 0.0
    for(num in exercise) {
        sum += num
    }
    println("Avarage is ${sum/exercise.size}")
}