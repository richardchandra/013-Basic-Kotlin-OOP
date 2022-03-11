package belajar.oop.app

import belajar.oop.model.Person

fun main() {
    val bruce = Person()
    //Can be done if variable declared with var not val
    bruce.firstName = "Bruce"

    println(bruce.firstName)
}