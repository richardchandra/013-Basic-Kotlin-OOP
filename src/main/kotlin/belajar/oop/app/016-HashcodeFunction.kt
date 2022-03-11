package belajar.oop.app

import belajar.oop.model.Company

fun main() {
    //If we override the hashCode(), we can compare the memory location of company's name
    //Different name will give different hashCode
    val company1 = Company("KFC")
    val company2 = Company("KFC")
    val company3 = Company("McD")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company3.hashCode())
    println(company1.hashCode() == company2.hashCode())
}