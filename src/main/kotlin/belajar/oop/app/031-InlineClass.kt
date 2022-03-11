package belajar.oop.app

import belajar.oop.model.Token

fun main() {
    val token = Token("this token")
    println(token.value)
    println(token.toUpper())
}