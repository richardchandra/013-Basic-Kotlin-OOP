package belajar.oop.model

class Note(title:String) {

    var title:String = title
        //get() = field
        //Get also can be created like this
        get(){
            return field
        }
        //set(value) = field = value
        //Set can also be created with
        set(value) {
            //Optional validation
            if(value.isNotBlank()){
                field=value
            }
        }
}