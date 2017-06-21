package implicitparameters

import math.Ordering

class MergeSortImplicit {
  def mergesort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = xs match {
        case Nil => ys
        case x :: xs1 => ys match {
          case Nil      => xs
          case y :: ys1 => if (ord.lt(x, y)) x :: merge(xs1, ys) else y :: merge(xs, ys1)
        }
      }
      val (first, last) = xs splitAt (n)
      merge(mergesort(first), mergesort(last))
    }

  }

}