package belajar.oop.app

import belajar.oop.model.Game
import belajar.oop.model.Login
import belajar.oop.model.MinMax

fun minmax(value1:Int, value2:Int): MinMax {
    return when {
        value1> value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback:(Login) -> Boolean):Boolean{
    return callback(login)
}

fun main() {
    val game = Game("Mario", 100)
    //Manually we can get the component
//    val name = game.name
//    val price = game.price
    val (name, price) = game

    val (min, max) = minmax(10, 100)
    println(min)
    println(max)

    //If there is data that we don't want, we can use underscore
    val (min2, _) = minmax(10, 100)
    println(min2)

    val login = Login("Bruce", "Secret")
    //Usually we declare it like this
//    login(login){login -> login.username == "Bruce" && login.password == "Secret"}
    //With destructuring the lambda function, we can
    login(login){(username, password) -> username == "Bruce" && password == "Secret"}


}