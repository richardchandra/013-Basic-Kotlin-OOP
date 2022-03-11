package belajar.oop.app

import belajar.oop.model.Product

fun main() {
    val product1 = Product("Ramen", 50, "Food")

    val product2 = product1.copy(name = "Candy")

    println(product1)
    println(product2)
}