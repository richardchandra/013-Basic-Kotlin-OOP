package belajar.oop.model

//This is constructor
//Better to put default value in constructor

class Car (paramBrand:String, paramYear:Int = 2015){

    //Initializer block
    //This line of code will be executed when object created
    init {
        println("Car $paramBrand created")
    }

    //This is a properties
    var brand:String = paramBrand
    var releaseYear:Int = paramYear

}