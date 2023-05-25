package com.gio

import java.lang.Exception
import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {
    val str = getNumber("10.5")
    println(str)

    try {
        val a = IntArray(5)
        a[12] = 12
    } catch (e: ArithmeticException) {
        println("Arithmetic exception catch")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Array index out of bounds exception")
    } catch (e: Exception) {
        println("parent exception class")
    }

    // nested try catch
    try {
        try {

        } catch (e: Exception) { }
    } catch (e: Exception) { }

    // finally - always executes
    try {
        val data = 10/5
        println(data)
    } catch (e: NullPointerException) {
        println(e)
    } finally {
        println("Finally block always executes")
    }
    println("Below code...")

    // throw - to throw explicit exception
    validate(15)
    println("code after validation check...")
}

fun validate(age: Int) {
    if(age < 18) {
        throw java.lang.ArithmeticException("Under age")
    }
    else print("Eligible for drive")
}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    }
}