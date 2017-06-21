package ClassHierarchy

/**
  * Created by manojma on 6/15/2017.
  */
object EmptySet extends IntSet{
   def contains(x: Int) = false

   def include(x: Int) = new NonEmpty(x,  EmptySet,  EmptySet)

   def union(other: IntSet) = other

   override def toString: String =   "."
}
