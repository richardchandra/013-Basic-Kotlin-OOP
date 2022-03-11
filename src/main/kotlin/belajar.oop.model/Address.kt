package belajar.oop.model

//We can also create secondary constructor without first constructor
class Address {

    constructor(paramStreet:String, paramCity:String){
        street = paramStreet
        city = paramCity
    }

    //We still can refer to other constructor
    constructor(paramStreet: String, paramCity: String, paramCountry:String):this(paramStreet, paramCity){
        country = paramCountry
    }

    //This is a properties
    //Without main parameter, we need to define the value manually
    var street:String = ""
    var city:String = ""
    var country:String = "Indonesia"

}