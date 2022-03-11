package belajar.oop.model

interface Interaction {
    val name : String
    //We can add concrete function, where this kind of function didn't need to be implemented on the inheritor
    fun sayHello(name:String){
        println("Hello $name, my name is ${this.name}")
    }
}

//We even can inherit interface that inherit other interface
interface Go:Interaction{
    fun go(){
        println("Go!")
    }
}

open class example()

//In inheritance, there might be some conflict
interface moveA{
    fun move(): Unit = println("Move A")
}

interface moveB{
    fun move(): Unit = println("Move B")
}

//We can do multiple inheritance for interface
//Inheritance in class can only be done once
class Human(override val name:String):Go, example(), moveA, moveB{
    //If we have conflicting function, we must override them
    override fun move(){
        //We can override whole function
        //But we also can call function on each interface
        super<moveA>.move()
        super<moveB>.move()
        println("Move human!")
    }
    //We can move this function because we already got the concrete function
//    override fun sayHello(name: String) {
//        println("Hello $name, my name is ${this.name} ")
//    }
}