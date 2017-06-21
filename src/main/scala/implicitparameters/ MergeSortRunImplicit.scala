package pairsandtuples

import implicitparameters.MergeSortImplicit

object MergeSortRunImplicit {
  def main(args: Array[String]): Unit = {
    val mergeSortImplicit = new MergeSortImplicit
    val list = List(49, 32, 46, 77, 20)

    println(mergeSortImplicit.mergesort(list))
  }
}