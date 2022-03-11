package belajar.oop.model

class Game(val name:String, val price:Int) {
    //If we want to manually get the name and price
    operator fun component1():String = name
    operator fun component2():Int = price
}