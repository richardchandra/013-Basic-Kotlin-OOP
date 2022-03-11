package belajar.oop.model

//We like to create class that represent data
//We can create data class, that automatically create equals, hashCode, toString, and copy function
data class Product (
    val name:String,
    val price:Int,
    val category:String)
