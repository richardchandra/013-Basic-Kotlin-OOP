package belajar.oop.model

//If we want to make class with one parameter only, we can create it as an inline class
//It will save memory for program
inline class Token(val value:String) {
    fun toUpper():String = value.toUpperCase()
}