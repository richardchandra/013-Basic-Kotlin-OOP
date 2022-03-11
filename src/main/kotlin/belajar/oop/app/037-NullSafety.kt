package belajar.oop.app

data class Friend(val name:String)

fun sayHello(friend: Friend?){
    //This is the way to allow null
    //This called safe call
    //println("Hello ${friend?.name}")

    //If we didn't want to print if the result null
    //This called manually checking for null
//    if (friend != null){
//        println("Hello ${friend.name}")
//    }

    //This called elvis operator, where null
//    val name = friend?.name ?:""
//    println("Hello $name")

    //Still give notnullpointerexeception
    val name = friend!!.name
    println("Hello $name")
}

fun main() {
    sayHello(Friend("Bruce"))
    sayHello(null)

}