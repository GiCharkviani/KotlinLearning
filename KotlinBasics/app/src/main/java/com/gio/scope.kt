package com.gio

fun main() {
    myFunction(56)
}

fun myFunction(a: Int) {
    // a = 5 // illegal, because a is parameter
    // a is a variable
    var b = a
    var a = 5
    println("a is $a and b is $b")
}