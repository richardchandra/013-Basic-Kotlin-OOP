package belajar.oop.app

import belajar.oop.model.SuperTeacher
import belajar.oop.model.Teacher

fun main() {
    val teacher = Teacher("Bruce")
    //We can't access private function
    //teacher.teach()

    val superTeacher = SuperTeacher("Clark")
    //We override the function and make it public, so we can use it in other file
    superTeacher.test()

}