package belajar.oop.app

import belajar.oop.model.Application

//We can create alias for class with long name
//Even we can create alias for another alias
typealias App = Application

//Type alias can also be generated for function
typealias StringSupplier = () -> String

fun sayHello(supplier:StringSupplier){
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
}