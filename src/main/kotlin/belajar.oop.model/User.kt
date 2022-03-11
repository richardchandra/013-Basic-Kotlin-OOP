package belajar.oop.model

//We can declare properties in constructor
class User (var username:String, var password:String){

    override fun toString(): String {
        return "User(username='$username', password='$password')"
    }
}