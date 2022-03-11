package belajar.oop.model

//This is inner class
//We have to add word "inner" in inner class to let function inside inner class access properties in the outer class
class Boss(val bossName:String) {

    inner class Employee(val name:String){
        fun hi(){
            //If we didn't add inner, we can't
            println("Hi, my name is $name, and my boss name is ${this@Boss.bossName}")
        }
    }

}