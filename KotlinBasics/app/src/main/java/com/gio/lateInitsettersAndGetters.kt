package com.gio

import java.lang.IllegalArgumentException

fun main() {
    var myCar = Car()
    println(myCar.owner)
    myCar.myBrand = "Merci you merci me"
    println(myCar.myBrand)
    myCar.maxSpeed = 12
    println(myCar.maxSpeed)

//    myCar.myModel = "C class"
    println(myCar.myModel)
}

class Car() {
    // it is like a final, you will initialize later
    lateinit var owner: String

    var myBrand: String = "Mercedes-benz"
        // Custom getter. field is the same as above field (myBrand)
        get () {
            return field.toLowerCase()
        }

    var maxSpeed: Int = 260
        // the setter is also automatically generated when using getter
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Max speed is less than 0")
        }

    var myModel: String = "CLS"
        // making setter private, so you won't be able to set, but you can get
        private set

    init {
        owner = "Gio"
    }
}
