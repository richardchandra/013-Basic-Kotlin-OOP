package belajar.oop.model

class Student (val name:String, val age:Int)

//This called extension function
//We can only access the public properties or functions
//If we change age to private, we can't access it in this function
fun Student?.sayHello(name:String){
    if(this != null){
        //In Kotlin, if we already search and validate (for example using if),
        // Kotlin is smart enough to let this to not be added with ?
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }
}

//We also can do extension properties
//If we try to extend properties, we need to add getter
val Student.upperName : String
    get() = this.name.toUpperCase()