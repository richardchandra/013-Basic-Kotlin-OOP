package belajar.oop.app

import belajar.oop.model.Person

fun main() {
    val hanks = Person()
    hanks.firstName = "Tom"
    hanks.middleName = "Middle"
    hanks.lastName = "Hanks"

    hanks.sayHello("guys")
    hanks.run()
    hanks.getFullName()
}