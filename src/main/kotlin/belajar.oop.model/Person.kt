package belajar.oop.model

class Person (){

    //This is a properties
    var firstName:String = ""
    var middleName:String? = null
    var lastName:String = ""

    //Add function
    fun sayHello(name:String){
        println("Hello $name, My name is $firstName")
    }

    //Function overloading
    //Same function name, but have to have different parameter length or type
    //This refers to the current object
    fun sayHello(firstName:String, lastName:String){
        println("Hello $firstName $lastName, My name is ${this.firstName}")
    }

    fun run(){
        println("I am Run")
    }

    fun getFullName():String{
        return "$firstName $middleName $lastName"
    }
}