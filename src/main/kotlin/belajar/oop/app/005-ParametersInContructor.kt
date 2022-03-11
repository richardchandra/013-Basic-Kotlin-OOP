package belajar.oop.app

import belajar.oop.model.User

fun main() {
    val user1 = User("Bruce", "Secret1")
    val user2 = User("Clark", "Secret2")

    user1.username = "Batman"
    user1.password = "IamBruceWayne"

    println(user1.username)
    println(user1.password)
    println(user2.username)
    println(user2.password)
}