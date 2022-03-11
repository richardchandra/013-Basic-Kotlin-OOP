package belajar.oop.app

import belajar.oop.model.Television

fun main() {
    //Initlate allow us to create object without initialize the properties
    val tv = Television()

    //This will give error result
//    println(tv.brand)

    //We have to initialize the properties
    //There are two ways to initialize the properties
    tv.brand = "Samsung"
    println(tv.brand)

    //Or using
    tv.initTelevision("Apple")
    println(tv.brand)

}