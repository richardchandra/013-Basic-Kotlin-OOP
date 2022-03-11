package belajar.oop.app

import belajar.oop.model.Address
import belajar.oop.model.Cat

fun main() {
    val tom = Cat("Tom")
    println(tom.name)
    println(tom.race)
    println(tom.bornYear)

    val address = Address("Sudirman Street", "Jakarta")
}