package com.gio



fun main() {
    val giorgi = Person("Giorgi", "Charkviani", 31)
    val john = Person("John", "Doe")
    val gela = Person(lastName = "Peterson")

    println("********")

    val samsung = MobilePhone("Android 12", "Samsung", "S20")
    val xiaomi = MobilePhone("Android 15", "Xiaomi", "MI Note 10")
    val iphone = MobilePhone("iOS", "Apple", "12 max")

    println("********")

    giorgi.hobby = "to skateboard"
    giorgi.age = 32
    println("Giorgi is ${giorgi.age} old")
    giorgi.stateHobby()

    john.hobby = "Play video games"
    john.stateHobby()

    println("--------")

    samsung.chargeBattery(30)
}

class Person(firstName: String = "Gela", lastName: String = "Cavatane") {
    // Member Variables - Properties
    var firstName: String? = null
    var age: Int? = null
    var hobby: String = "watch Netflix"

    // Member functions - Methods
    fun stateHobby() {
        println("$firstName's hobby is $hobby")
    }

    init {
        this.firstName = firstName
        println("Person created with first name - $firstName and last name - $lastName")
    }

    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age;
        println("Person created with first name - $firstName and last name - " +
                "$lastName and the age - $age")
    }
}

class MobilePhone(osName: String, brand: String, model: String) {
    var battery = 10

    init {
        println("Mobile hs OS $osName, brand is $brand and the model is $model")
    }

    fun chargeBattery(chargedBy: Int) {
        println("Battery was on $battery percent. It was charged by $chargedBy percent " +
                "now is on ${battery + chargedBy} percent")
        battery += chargedBy
    }


}