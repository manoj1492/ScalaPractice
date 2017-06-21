package ClassHierarchy

/**
  * Created by manojma on 6/15/2017.
  */
abstract class IntSet {
  def include(x: Int) : IntSet
  def contains(x:Int) :Boolean
  def union(other: IntSet): IntSet
}
