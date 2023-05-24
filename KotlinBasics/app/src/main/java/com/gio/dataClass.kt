package com.gio

// should have at least one parameter
data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Gis")
    val user1Name = user1.name
    println(user1Name)
//    user1.id = 2 // it won't work as the parameter is val
    user1.name = "Gio"

    val user2 = User(1, "Gio")

    println(user1.equals(user2)) // they will equal if they have the same values in fields
    println(user1 == user2) // the same

    println("User Details: $user1")

    // you can copy also like so
    val updatedUser = user1.copy(name = "Denis Gis")
    println(user1)
    println(updatedUser)

    // getting the components
    println(updatedUser.component1()) // prints id
    println(updatedUser.component2()) // prints name

    // deconstruction
    val (id, name) = updatedUser
    println("$id and $name")
}