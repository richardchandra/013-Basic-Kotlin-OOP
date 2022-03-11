package belajar.oop.app

import belajar.oop.model.Rectangle

fun main() {
    val shape = Rectangle()
    println("Corner ${shape.corner}")
    println("Parent corner ${shape.parentCorner}")

    shape.printName()
}

