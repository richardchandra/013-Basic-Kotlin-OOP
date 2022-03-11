package belajar.oop.app

import belajar.oop.model.MyBase
import belajar.oop.model.MyBaseDelegation

fun main() {
    val base = MyBase()
    base.sayHello("Bruce")

    //If we create a delegation
    val baseDelegation = MyBaseDelegation(base)
    //This line of code, will refer to function inside base
    baseDelegation.sayHello("Clark")
    baseDelegation.sayGoodbye("Clark")
}