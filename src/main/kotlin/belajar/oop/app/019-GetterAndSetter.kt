package belajar.oop.app

import belajar.oop.model.Note

fun main() {
    val note = Note("Java Note")

    //Without setTitle like Java, note.title can auto call set
    println(note.title)

    //It also can auto call get
    note.title = "Kotlin Note"
    println(note.title)

    //Getter and setter are not mandatory

    val bigNote = BigNote("learn kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)

}

class BigNote(val title:String){
    //Val will hinder you to create set
    val bigTitle:String
        get() = title.toUpperCase()
    
}