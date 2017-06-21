package pairsandtuples

object MergeSortRun {
  def main(args: Array[String]): Unit = {
    val mergeSort = new MergeSort
    val list = List(49, 32, 46, 77, 20)

    println(mergeSort.mergesort(list))
  }
}