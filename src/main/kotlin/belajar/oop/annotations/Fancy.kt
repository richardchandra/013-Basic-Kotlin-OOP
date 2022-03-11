package belajar.oop.annotations

//Only can be used on class
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
//Annotation class can't have a body
annotation class Fancy (val author:String)