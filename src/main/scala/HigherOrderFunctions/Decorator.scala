package HigherOrderFunctions

/**
  * Created by manojma on 5/10/2017.
  */
class Decorator(left: String, right: String) {

  def layout[A](x: A) = left + x.toString + right

}

