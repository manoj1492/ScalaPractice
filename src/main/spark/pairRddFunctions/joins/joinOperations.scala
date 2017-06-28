package pairRddFunctions.joins

import sparkContextInitialize.SparkContextInitialization

object joinOperations {
  
  def main(args: Array[String]): Unit ={
  val sc = SparkContextInitialization.getSparkContext()
  
  val lines = Array("Hello World", 
  "In this case we are trying to understand", 
  "the purpose of flatMap", 
  "flatMap is a function which will apply transformation", 
  "if the transformation results in array, it will flatten out array as individual records", 
  "let us also understand difference between map and flatMap", 
  "in case of map, it take one record and return one record after applying transformation", 
  "even if the transformation result in an array", 
  "where as in case of flatMap, it might return one or more records", 
  "if the transformation of 1 record result an array of 1000 records, ", 
  "then flatMap returns 1000 records")
  
 /* val linesRDD = sc.parallelize(lines)
  val linesMap = linesRDD.flatMap(x => x.split(","))
  val words = linesMap.flatMap(x => x.split(" "))
  val wordsMap = words.map(x => (x, 1))*/
  
  val list = sc.parallelize(List((1, 2), (3, 4), (3, 6)))
  val result = list.combineByKey(
  (v) => (v, 1),
  (acc: (Int, Int), v) => (acc._1 + v, acc._2 + 1),
  (acc1: (Int, Int), acc2: (Int, Int)) => (acc1._1 + acc2._1, acc1._2 + acc2._2)
  ).map{ case (key, value) => (key, value._1 / value._2.toFloat) }
  result.collectAsMap().map(println(_))
  
  
 /* 
  val pairs = linesRDD.map(x => (x.split(" ")(0), x))
  val pairsGroup = pairs.cogroup(pairs)
  pairsGroup.foreach(println)*/
  }
}