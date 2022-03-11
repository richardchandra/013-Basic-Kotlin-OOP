package belajar.oop.model

class Television {

    //Only capable for mutable variable
    lateinit var brand:String

    fun initTelevision(brand:String){
        this.brand = brand
    }

}