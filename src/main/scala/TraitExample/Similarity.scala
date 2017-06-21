package TraitExample

/**
  * Created by manojma on 5/10/2017.
  */
trait Similarity {

  def isSimilar(x: Any): Boolean // not defined
  def isNotSimilar(x: Any): Boolean = !isSimilar(x) // defined
}
