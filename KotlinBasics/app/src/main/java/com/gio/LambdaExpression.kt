package com.gio

fun main() {
    // usual function
    val simpleSum = addNumber(5,4)
    println(simpleSum)

    // lambda function
    val sum: (Int, Int) -> Int = {a: Int, b:Int -> a + b}
    println(sum(1, 41))

    // simpler lambda
    val sum2 = {a: Int, b: Int -> println(a+b)}
    sum2(12,21)
}

fun addNumber(a: Int, b: Int): Int {
    return a + b
}