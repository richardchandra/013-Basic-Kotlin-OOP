package belajar.oop.model

open class Employee (val name:String){
    //We add open to open access for overriding
    open fun sayHello(name:String){
        println("Hello $name, my name is ${this.name}")
    }
}

open class Manager(name:String):Employee(name){
    final override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
}

class VicePresident(name:String):Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President ${this.name}")
    }
}

class SuperManager(name:String):Manager(name){
    //Because we add final, we can't override the function
}