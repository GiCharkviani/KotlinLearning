package com.gio

fun main() {
    for(i in 1 until 20) {
        if(i/2 == 5) {
//            break
            continue
        }
//        println("$i ")
    }
//    println("Done with the loop")

//    myFunction()

    // argument
    val result = addUp(45, 12)
//    println("result is $result")
//    println("added up ${addUp(21,23)}")
//    println("avg is ${avg(5.0,13.0)}")

    // Nullable - helps you to avoid null pointer exception in runtime
//    var name: String = "Giorgi"
//    name = "Abraham"
//    name = null -> Compilation ERROR

    var nullableName: String? = "Gio"
//    nullableName = null

//    var len = name.length

    // new way:
    var len2 = nullableName?.length
    nullableName?.lowercase()

    // execute code in case nullableName is not null:
    nullableName?.let {
        println(it.length)
    }

    // old way:
    /*
    if (nullableName != null) {
        var len2 = nullableName.length
    } else null
     */

    // Elvis operator - if nullableName is null, then use default value
//    nullableName = null
    val name = nullableName ?: "Guest"
    println("name is ${name}")

    // this will create null pointer exception
    println(nullableName!!.lowercase())

    // chain-safe call:
//    val wivesAge: String? = user?.wife?.age ? : 0
}

// Functions
fun myFunction() {
    println("Called from myFunction")
}

// Parameter
fun addUp(a: Int, b: Int): Int {
    // output
    return a + b
}

fun avg(a: Double, b: Double): Double {
    return (a+b)/2
}

// Method - a Method is a Function within a class