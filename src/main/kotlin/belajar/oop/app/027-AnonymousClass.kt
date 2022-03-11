package belajar.oop.app

import belajar.oop.model.Action

fun fireAction(action: Action){
    action.action()
}

class SampleAction:Action{
    override fun action(){
        println("This is sample action")
    }
}

fun main() {
    fireAction(SampleAction())
    //We can create anonymous function
    fireAction(object:Action{
        override fun action(){
            println("Action one")
        }
    })
    fireAction(object:Action{
        override fun action() = println("Action two")
    })
}