package belajar.oop.app

import belajar.oop.model.Application
import belajar.oop.model.Utilities

fun main() {
    //The changes will affect everything that refer to utilities
    Utilities.name = "Changed"
    println(Utilities.toUpper("lowkey"))
    //Function a and b will give result "Changed"
    a()
    b()

    println(Application.Utilities.toUpper("downwards"))

    //Companion example
    println(Application.sayGoodbye("Tom"))
    //It is same as
    println(Application.Response.sayGoodbye("Tom"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}