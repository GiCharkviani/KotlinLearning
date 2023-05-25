package com.gio

fun main() {
    val obj: Any? = null
    // unsafe
//    val str: String = obj as String
    // safe - as? - save cast operator
    val str: String? = obj as? String
    val str2: String? = obj as String?

    println(str)
    println(str2)

}