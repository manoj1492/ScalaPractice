/**
  * Created by manojma on 5/10/2017.
  */
object Factorial extends App{
// Example of nested function

  def factorial(x: Int): Int ={
    def fact(x:Int, accumulator:Int): Int ={
      if(x<=1) accumulator
      else fact(x-1, x*accumulator)
    }

    fact(x,1) // last statement of a function is always its return statement
  }

  println("factorial of 5 is "+ factorial(5))
}
