package ClassHierarchy

/**
  * Created by manojma on 6/15/2017.
  */
class NonEmpty(elem : Int, left: IntSet, right: IntSet) extends IntSet{

   def contains(x: Int) = {
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  }

   def include(x: Int) = {
    if(x < elem) new NonEmpty(elem, left include x, right)
    else  if(x > elem) new NonEmpty(elem, left, right include x)
    else this
  }

  def union(other: IntSet): IntSet = ((left union right) union other) include elem

  override def toString: String = "{" + left + elem + right +"}"
}
