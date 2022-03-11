package belajar.oop.app

import belajar.oop.model.Company

fun main() {
    //In Kotlin, if we compare two object, it means we compare the hashcode
    //If we want to compare them, we have to use equal function
    //If we want to compare the value of object, we have to override the equal function in Any class
    val company1 = Company("KFC")
    val company2 = Company("KFC")

    println(company1 == company2)
}