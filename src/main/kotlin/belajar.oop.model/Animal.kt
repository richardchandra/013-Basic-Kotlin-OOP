package belajar.oop.model

abstract class Animal {
    abstract val name:String
    abstract fun run()
}

class Rat:Animal(){
    override val name: String = "Rat"
    override fun run() {println("Rat run")}
}

class Dog:Animal(){
    override val name: String = "Dog"
    override fun run() {println("Dog run")}
}