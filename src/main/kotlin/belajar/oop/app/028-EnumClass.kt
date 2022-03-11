package belajar.oop.app

import belajar.oop.model.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    //Getting all gender
    val allGenders:Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(allGenders.toList())

    man.showDescription()
    woman.showDescription()
}