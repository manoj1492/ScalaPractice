package MixingClass

/**
  * Created by manojma on 5/10/2017.
  */
abstract class AbsIterator {

  type T // declaring Type T
  def hasNext : Boolean // declared hasNext function which returns a boolean
  def next : T // declared a function with return type T
}

