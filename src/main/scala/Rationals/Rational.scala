package Rationals

/**
  * Created by manojma on 6/14/2017.
  */
class Rational(x: Int, y:Int) {

  require( y > 0 ,"denominator must not be zero")// checks a precondition

  private def gcd(a:Int, b:Int):Int = if (b==0) a else gcd(b, a % b)

  def numer = x ;
  def denom = y ;

  def this(x:Int) =  this(x,1)// another constructor

  def add(that: Rational) = {
    new Rational(
      numer*that.denom+ denom* that.numer, denom * that.denom
    )
  }

  def subtract(that : Rational) = add(that.neg)

  def neg  = new Rational(-numer, denom)

  def less(that: Rational) = this.numer * that.denom < this.denom * that.numer

  def max(that: Rational) = if(this.less(that)) that else this

  override def toString: String = numer/gcd(numer,denom) + "/" + denom/gcd(numer,denom)
}

object Rational{
  def main(args: Array[String]): Unit ={
    val x = new Rational(3,2)
    val y = new Rational(1,5)
    val z = new Rational(4,6)

    val r = new Rational(2)

    println(r)

    println(x.add(y))

    println(x.neg)

    println(x.subtract(y))

    println((x.subtract(y)).subtract(z))
  }
}
