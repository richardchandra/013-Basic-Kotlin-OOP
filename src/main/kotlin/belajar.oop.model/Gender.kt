package belajar.oop.model

//We can add constructor in enumerate class
enum class Gender (val description:String) {
    MALE("Male"), FEMALE("Female");

    //We also can add function in enum class
    //If we add function, we have to add semicolon in the end of class
    fun showDescription(){
        println(description)
    }
}