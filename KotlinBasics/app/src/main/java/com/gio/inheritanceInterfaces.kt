package com.gio


interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is braking")
    }
}


// Super class
open class Vehicle {
    // properties
    // methods
}

// if class is sealed, you can't inherit
// also by default, in kotlin each class is final, that's why
// we should use open keyword in front of class to be able to inherit
//sealed class Car: Vehicle() {
//
//}


// sub/child/derived class of Vehicle class
open class Machine(val name: String, val brand: String, override val maxSpeed: Double): Drivable {
    // open goes for fields as well
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if(amount > 0)
            range += amount
    }

    override fun drive(): String {
        return "Driving the interface drive"
    }

    // the same as above
//    open fun drive(distance: Double) = "Driving the interface drive"

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }
}

class ElectricMachine(name: String, brand: String, maxSpeed: Double, batteryLife: Double):
    Machine(name, brand, maxSpeed) {
    var chargerType: String? = null

    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("Drove for $range KM on electricity")
    }

    override fun drive() = "Driving the interface drive"

    override fun brake() {
        super.brake()
        println("Break inside of electric car")
    }
}

fun main() {
    var mercedesCClass = Machine("C-class", "Mercedes-benz", maxSpeed = 260.0)
    var teslaS = ElectricMachine("S-Model", "Tesla", batteryLife = 85.0, maxSpeed = 260.0)
    teslaS.drive()

    // Polymorphism
    teslaS.extendRange(200.0)
    mercedesCClass.drive(200.0)
    teslaS.drive(200.0)

    teslaS.brake()
    mercedesCClass.brake()
}