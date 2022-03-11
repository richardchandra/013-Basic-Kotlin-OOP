package belajar.oop.model

//We can create singleton class as an inner class
//But, singleton class can never access properties or function in outer class
class Application(val name:String) {

    object Utilities{
        fun toUpper(name:String):String{
            return name.toUpperCase()
        }
    }

    //We can create companion object
    //Companion object let class access the inside of singleton class
    //You don't even have to name the companion object
    companion object Response{
        fun sayGoodbye(name:String){
            println("Goodbye $name")
        }
    }
}