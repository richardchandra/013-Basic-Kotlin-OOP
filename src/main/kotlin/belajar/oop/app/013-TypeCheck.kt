package belajar.oop.app

import belajar.oop.model.HandPhone
import belajar.oop.model.Laptop

//Any class will receive parameter in every type of data or class
fun printObject(any:Any){
    if(any is Laptop){
        //If we use "is", Kotlin will do smart casting
        //Different in Java, where Java have to manually casting the object to certain class
        println("Laptop ${any.name}")
    } else if(any is HandPhone) {
        println("HandPhone is ${any.name}")
    } else {
        println(any)
    }
}

//We also can cast with When
fun printObjectAgain(any:Any){
    when (any) {
        is Laptop -> {
            println("Laptop ${any.name}")
        }
        is HandPhone -> {
            println("HandPhone is ${any.name}")
        }
        else -> {
            println(any)
        }
    }
}

//We can unsafely cast type, but if the class didn't match, it will give ClassCastException
fun printString(any:Any){
    val value = any as String
    println(value)
}

//To safely cast a type, we can use safe nullable casts
fun safePrintString(any:Any){
    val value:String? = any as? String
    println(value)
}

fun main() {
    printString("Goku")
    //This will give ClassCastException
    //printString(1)
    //This is will give null instead of error
    safePrintString("Saitama")
    safePrintString(1)

    printObject("Bruce")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(HandPhone("Samsung"))
}