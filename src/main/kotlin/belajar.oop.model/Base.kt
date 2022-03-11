package belajar.oop.model

interface Base {
    fun sayHello(name:String)
    fun sayGoodbye(name:String)
}

class MyBase : Base{
    override fun sayHello(name:String){
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Goodbye $name")
    }
}

//Delegation Manual
//class MyBaseDelegation(val base:Base):Base{
//    override fun sayHello(name: String) {
//        base.sayHello(name)
//    }
//}

//Easy delegation
//We can override function if we don't want refer to the other function
class MyBaseDelegation(val base:Base):Base by base{
    override fun sayHello(name: String) {
        println("Hi $name")
    }
}