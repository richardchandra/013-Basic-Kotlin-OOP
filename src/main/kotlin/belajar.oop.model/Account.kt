package belajar.oop.model

import kotlin.properties.Delegates

//Will assign last line to the variable name, after executed
class Account (description:String = ""){
    val name:String by lazy{
        println("Name is called")
        "Bruce"
    }

    var description:String by Delegates.observable(description){
        property, oldValue, newValue ->  println("${property.name} is changed from $oldValue to $newValue")
    }
}

//If it was immediately assign, it was called eager
//val name:String = "Bruce" >>> Is eager