/**
  * Created by manojma on 6/14/2017.
  */

import math.abs
object FixedPoint {

  val tolerance = 0.0001
  def main(args: Array[String]): Unit ={
    fixedPoint(x => 1+x/2)(3)
  }

  def isCloseEnough(x: Double, y: Double)= {
    abs((x-y)/x)/x< tolerance
  }

  def fixedPoint(f: Double => Double)(firstGuess: Double)={
    def iterate(guess: Double): Double={
      val next = f(guess)
      if(isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }
}
