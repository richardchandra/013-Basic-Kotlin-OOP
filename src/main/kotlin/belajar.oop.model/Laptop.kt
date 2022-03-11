package belajar.oop.model

//If we didn't declare the parent of class, then the default parent is Any class
//Like object class in Java
class Laptop (val name:String)

open class HandPhone(val name:String)

class SmartPhone(name:String, val os:String):HandPhone(name)