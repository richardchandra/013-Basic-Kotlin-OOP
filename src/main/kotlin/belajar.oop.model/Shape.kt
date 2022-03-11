package belajar.oop.model

open class Shape {
    open val corner:Int = 1
    open fun printName(){
        println("This is Shape")
    }
}

class Rectangle:Shape(){
    //Default is final, if we want to override, add open
    final override val corner:Int = 4
    //Super refer to the parent's properties
    //We can't make super.super
    val parentCorner:Int = super.corner

    //Super can also refer to parent's function
    override fun printName() {
        println("This is rectangle")
        super.printName()
    }
}

class Triangle:Shape(){
    override val corner:Int = 3
}