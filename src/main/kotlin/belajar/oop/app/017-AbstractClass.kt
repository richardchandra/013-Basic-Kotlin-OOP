package belajar.oop.app

import belajar.oop.model.City
import belajar.oop.model.Country

fun main() {
    //We can't create Location as an object
    //val city = Location("Canada") will cause error
    val city = City("New York")
    val country = Country("USA")

    println(city.name)
    println(country.name)

}