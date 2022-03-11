package belajar.oop.model

open class Teacher(private val name :String) {
    //We can add visibility modifier
    //The default is public, it means it can be accessed everywhere
    //Private, it means it can be accessed inside the class only
    //Protected, it means it can be accessed from inside the class or by their child
    //Internal it means it can be accessed from the project only,
        //if we build this file to jar, the jar user can't used it
    private fun teach(){
        println("Teach!")
    }

    open protected fun test(){
        println("Test")
    }
}

class SuperTeacher(name:String):Teacher(name){
    override public fun test(){
        super.test()
    }
}