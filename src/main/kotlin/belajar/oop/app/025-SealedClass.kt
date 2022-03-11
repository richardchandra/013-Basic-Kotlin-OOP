package belajar.oop.app

import belajar.oop.model.Minus
import belajar.oop.model.Operation
import belajar.oop.model.Plus

//Sealed class is best when used in when clause
fun operation(value1:Int, value2:Int, operation: Operation):Int {
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}

fun main() {
    println(operation(10, 10, Plus()))
    println(operation(10, 5, Minus()))
}