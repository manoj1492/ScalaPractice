package MixingClass

/**
  * Created by manojma on 5/10/2017.
  */

//Applies a given function to each element returned by the iterator
trait RichIterator extends AbsIterator{

  def foreach(f: T => Unit) {while (hasNext) f(next)} // function foreach using the functions hasNext and next
  // of Absiterator, which are implemented in Stringiterator
  // Applying f (passed as an argument) to  each element of type T
}