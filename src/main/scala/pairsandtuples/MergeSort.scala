package pairsandtuples

class MergeSort {
  def mergesort(xs : List[Int]): List[Int] = {
    val n = xs.length/2
    if(n==0) xs
    else{
      val (first, last) = xs splitAt(n)
      merge(mergesort(first), mergesort(last))
    }
  }
  
  def merge(xs: List[Int], ys: List[Int]): List[Int] = xs match{
    case Nil => ys
    
    case x :: xs1 => ys match{
      case Nil => xs
      
      case y :: ys1 => if ( x < y) x :: merge(xs1, ys) else y :: merge(xs, ys1) 
    }
  }
}