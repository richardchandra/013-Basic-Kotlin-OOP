package belajar.oop.app

import belajar.oop.model.User

fun main() {
    val user1 = User("Bruce", "Secretive")

    //Instead of printing user1's hashcode, it will print string
    println(user1)
}