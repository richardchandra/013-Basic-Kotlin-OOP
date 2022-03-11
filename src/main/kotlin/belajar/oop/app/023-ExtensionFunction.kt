package belajar.oop.app

import belajar.oop.model.Student
import belajar.oop.model.sayHello
import belajar.oop.model.upperName

fun main() {
    val student:Student? = Student("Peter", 18)
    student.sayHello("MJ")
    println(student?.upperName)

}