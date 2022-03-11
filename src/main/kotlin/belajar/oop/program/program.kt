package belajar.oop.program

import belajar.oop.annotations.Fancy

@Fancy(author = "Bruce")
class MyApplication(val name:String, val version: Int){
    fun info():String = "Application $name-$version"
}