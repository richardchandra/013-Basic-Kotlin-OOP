package belajar.oop.model

//Abstract class act as parent only,and we can't declare an object as an abstract class
//Abstract class automatically become open
abstract class Location(val name:String)

class City(name:String):Location(name)

class Country(name:String):Location(name)

