package belajar.oop.app

import belajar.oop.validation.ValidationException

fun validateAndSayHello(name:String){
    if(name.isBlank()){
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Bruce")
        validateAndSayHello("")
    } catch (error:ValidationException){
        println("Error ${error.message}")
    } catch (error:NullPointerException){
        println("Error Null Pointer Error")
    } finally {
        println("Program finished")
    }
}