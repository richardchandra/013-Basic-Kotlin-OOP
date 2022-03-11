package belajar.oop.model

//Everywhere we access utilities, we add refer to this object
object Utilities {

    //Because it can be changed from anywhere, better to use immutable
    //In this case, we let the variable become mutable for learning purpose
    var name:String = "My Utilities"

    fun toUpper(value:String):String{
        return value.toUpperCase()
    }
}