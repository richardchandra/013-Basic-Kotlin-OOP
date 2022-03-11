package belajar.oop.app

import belajar.oop.model.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung S21", "Android")

    println(smartPhone.toString())
    println(smartPhone.hashCode())

}