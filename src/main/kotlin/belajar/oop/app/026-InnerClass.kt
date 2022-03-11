package belajar.oop.app

import belajar.oop.model.Boss
import belajar.oop.model.Employee

fun main() {
    //If we create an inner class, we can't create the employee only
//    val employee = Boss.Employee()
    //We have to create boss first, and then employee
    val bruce = Boss("Bruce")

    val alfred = bruce.Employee("Alfred")
    val damian = bruce.Employee("Damian")

    alfred.hi()
    damian.hi()
}