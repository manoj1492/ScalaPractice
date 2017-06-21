/**
  * Created by manojma on 6/13/2017.
  */
import math.abs

object sqrtnewton {
  def main(args: Array[String]): Unit ={

    println(sqrt(4))
  }

  def sqrt(x: Double): Double = {

    def sqrIter(guess: Double): Double = {

      if (isGoodEnough(guess)) guess
      else sqrIter(improve(guess))

    }

    def isGoodEnough(guess: Double) = {
      abs(guess * guess - x) / x < 0.001
    }

    def improve(guess: Double) = {
      (guess + x / guess) / 2
    }
    sqrIter(1.0)
  }
}
