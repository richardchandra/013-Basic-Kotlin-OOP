package belajar.oop.app

import belajar.oop.model.Car

fun main() {
    val avanza = Car("Toyota")
    val almaz = Car("Wuling", 2019)

    println(avanza.brand)
    println(avanza.releaseYear)
    println(almaz.brand)
    println(almaz.releaseYear)
}