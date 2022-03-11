package belajar.oop.app

import belajar.oop.model.Rectangle
import belajar.oop.model.Shape
import belajar.oop.model.Triangle

fun main() {
    val shape  = Shape()
    println(shape.corner)

    val shape2 = Rectangle()
    println(shape.corner)

    val shape3 = Triangle()
    println(shape.corner)
}