package belajar.oop.app

import belajar.oop.model.Fruit

fun main() {
    val fruit1 = Fruit(100)
    val fruit2 = Fruit(200)
    //We can do this until we overload the operator +
    val fruit3 = fruit1 + fruit2
    println(fruit3)
}