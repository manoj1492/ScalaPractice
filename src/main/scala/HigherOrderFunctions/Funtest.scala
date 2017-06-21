package HigherOrderFunctions

/**
  * Created by manojma on 5/10/2017.
  */
object Funtest extends App {

  def apply(f: Int=> String, v: Int) = f(v) // defining a function apply which takes another function as a paramter and an int value
  // the function passed to apply is of class Decorator
  val decorator = new Decorator("[","]") // object of decorator to call the function of decorator
  println(apply(decorator.layout, 7))

}
