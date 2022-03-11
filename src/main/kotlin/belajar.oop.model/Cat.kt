package belajar.oop.model

//We can create secondary constructor
//Secondary constructor have to refer to the first parameter
class Cat (paramName:String, paramRace:String, paramYear:Int){

    init {
        println("Cat $paramName is created")
    }

    constructor(paramName:String, paramRace:String): this(paramName, paramRace, 2020){
        println("Secondary constructor was used")
    }

    //We can make other constructor that refer to other secondary contructor
    constructor(paramName:String):this(paramName, "Persian"){
        println("Another secondary constructor was used")
    }

    var name:String = paramName
    var race:String = paramRace
    var bornYear:Int = paramYear


}