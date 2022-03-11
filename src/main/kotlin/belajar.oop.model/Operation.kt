package belajar.oop.model

//Automatically become abstract class
//Best for become parent in inheritance
//Can be used to create object
sealed class Operation (val name:String)

class Plus:Operation("Add")
class Minus:Operation("Minus")