package MixingClass

/**
  * Created by manojma on 5/10/2017.
  */
object StringIteratorTest {

  def main(args: Array[String]): Unit ={
    class Iter extends StringIterator(args(0)) with RichIterator// Mixing class composition
    val iter = new Iter
    iter.foreach(println) // applying println function to every character returned by the iterator
    // last statement can also be written as iter foreach println
  }
}
