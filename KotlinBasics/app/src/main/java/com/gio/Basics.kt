package com.gio

fun main() {
    // mutable variable
    var myName = "Gio"
    myName = "Heidi"
    myName = "Gaga"

    // immutable variable
    val unchangable = "you"

    /* Types */
    // Integer TYPES: Byte (8bit), Short (16 bit),
    // Int (32), Long (64 bit)
    val myByte: Byte = 127
    val myShort: Short = 125
    val myInt: Int = 1234561231
    val myLong: Long = 1231_2131_231312_23131
    // by default it assigns type - type inference

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.999999f
    val myDouble: Double = 3.123131313133213

    // Booleans
    val isSunny: Boolean = true;

    // Character
    val letterChar: Char = 'A'
    val digitChar: Char = '1'

    // Strings
    val myStr: String = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    // String interpolation
//    print("Hello $lastCharInStr")
//    print("\nLength is ${myStr.length}")

    // Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    result = 15 % 2
    var a = 5.0
    var b = 3.0
    var division = a / b
//    print(division)

    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5 == 3
//    println("isEqual is $isEqual")

    val isNotEqual = 5 != 5
//    println("isNotEqual is $isEqual")
//
//    println("is5Greater3 ${5>3}")
//    println("is5LowerEqual3 ${5<=3}")
//    println("is5LowerEqual3 ${5>=3}")

    // Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
//    println("myNum is $myNum")
    myNum *= 4
//    println("myNum is $myNum")
    myNum /= 4
//    println("myNum is $myNum")
    myNum %= 4
//    println("myNum is $myNum")

    // Increment & Decrement operators (++, --)
    myNum++
//    println("myNum is $myNum")
    myNum--
//    println("myNum is $myNum")
//    println("myNum is ${myNum++}")
//    println("myNum is ${++myNum}")
//    println("myNum is ${--myNum}")

    // Conditionals

    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
//        println("Use raw force")
    } else if (heightPerson1 == heightPerson2) {
//        println("use your power technique 1337")
    } else {
//        println("Use technique")
    }

    //create a variable for testing all condition
    val age = 16
    //create a variable for drinkingAge
    val drinkingAge = 21
    //create a variable for votingAge
    val votingAge = 18
    //create a variable for drivingAge
    val drivingAge = 16

    //Assign the if statement to a variable
    val currentAge = if (age >= drinkingAge) {
        println("Now you may drink in the US")
        //return the value for this block
        drinkingAge
    } else if (age >= votingAge) {
        println("You may vote now")
        //return the value for this block
        votingAge
    } else if (age >= drivingAge) {
        println("You may drive now")
        //return the value for this block
        drivingAge
    } else {
        println("You are too young")
        //return the value for this block
        age
    }
    //print the age for the passing condition
//    print("current age is $currentAge")

    // Note: you can assign if statement to variable
    val myAge = 54
    val amIAdult = if (myAge < 19) {
        "I am not adult"
    } else {
        "I am an adult"
    }
//    println("adultness: $amIAdult")

    // When expression (The same as switch)
    var season = 3

    /*
    when (season) {
        1 -> println("Spring")
        2 -> print("Summer")
        3 -> println("Autumn")
        4 -> println("Winter")
        5 -> {
            println("There is not such a season (5)")
        }

        else -> {
            println("Invalid season")
        }
    }
     */

    var month = 3

    /*
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Winter")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }
     */

    val asaki = 7

    /*
    when {
       asaki >= 21 -> println("now you may drink in the US")
       asaki >= 18 -> println("you may vote now")
       asaki >= 16 -> println("you may drive now")
       else -> println("you're too young")
    }
     */

    /*
    when(asaki) {
       in 21..Int.MAX_VALUE  -> println("now you may drink in the US")
       in 18..Int.MAX_VALUE -> println("you may vote now")
       in 16..Int.MAX_VALUE -> println("you may drive now")
       !in 1..4 -> println("you can't go to shcool")
       else -> println("you're too young")
    }
    */

// any type
    var x: Any = 13.37f
    /*
    when(x) {
       is Int -> println("$x is an Int")
       is Double -> println("$x is a Double")
       is String -> println("$x is a String")
       is Float -> println("$x is a Float")
       !is Int -> println("$x is not Int")
       else -> println("$x is none of the above")
    }
    */

    /**
    var x : Any = 13.37
    when(x) {
    is Int -> println("$x is an Int")
    !is Double -> println("$x is not Double")
    is String -> println("$x is a String")
    else -> println("$x is none of the above")
    }
     **/

    val x2: Any = 13.37
//assign when to a variable
    val result2 = when (x2) {
//let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    //print("$x $result2")

    // while loop executes a block of code repeatedly as long as a given condition is true
    var y = 1
    while (y <= 10) {
//        println(y)
        y++
    }

//    println("While loop is done")
    var hundrad = 100
    while (hundrad > 0) {
//        println(hundrad)
        hundrad -= 2
    }

    // do/while
    do {
//        println(hundrad)
        hundrad -= 2
    } while (hundrad > 0)
//    println("Do/While loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if(roomTemp >= 20) {
            feltTemp = "comfy"
//            println("it's comfy now")
        }
    }

    // For loops
    for(num in 1..10) {
//        println("$num")
    }

    for(i in 1 until 10) {
        println("$i ")
    }
    println("_________")
    for(i in 10 downTo 1) {
//        println("$i ")
    }

    for(i in 10 downTo 1 step 2) { // Same as - for(i in 10.downTo(1).step(2)
//        println("$i ")
    }

    println("Task")
    for(i in 0..10000) {
        if(i === 9001) println("IT'S OVER 9000!!!")
    }

    var humid = "humid"
    var humidityLevel = 80
    while (humid == "humid") {
        humidityLevel -= 5
        println("Humidity decreased")
        if(humidityLevel == 60) {
            humid = "comfy"
            println("It's comfy now")
        }
    }


}