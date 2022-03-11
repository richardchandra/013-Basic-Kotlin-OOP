package belajar.oop.app

import belajar.oop.model.Manager
import belajar.oop.model.VicePresident

fun main() {
    val manager = Manager("Alfred")
    manager.sayHello("Damian")

    val vicePresident = VicePresident("Tim")
    vicePresident.sayHello("Damian")
}