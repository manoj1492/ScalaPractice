package pairRddFunctions

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.log4j.{Level,Logger}
import sparkContextInitialize.SparkContextInitialization

object pairRddTransformations {
  
  // All the transformations that could be performed on single pair Rdds are given here
  def main(args: Array[String]): Unit = {
    
    val sc = SparkContextInitialization.getSparkContext()
    val list = sc.parallelize(List((1, 2), (3, 4), (3, 6)))

    //transformations
    val reduceByKey = list.reduceByKey((x, y) => x + y)
    val groupByKey = list.groupByKey()
    val mapValues = list.mapValues(x => x + 1)
    val flatMapValues = list.flatMapValues(x => x.to(5))
    val keys = list.keys
    val values = list.values
    val sortByKey = list.sortByKey() // sorts automatically by key, if not explicitly specified

    //actions
    val operation = List(reduceByKey, groupByKey, mapValues, flatMapValues, keys, values, sortByKey)

    operation.map(x => x.foreach(println))

    // Transformation on two pair Rdds

    val other = sc.parallelize(List((3, 9)))

    val subtractByKey = list.subtractByKey(other)
    val join = list.join(other)
    val intersection = list.intersection(other)
    val rightOuterJoin = list.rightOuterJoin(other)
    val leftOuterJoin = list.leftOuterJoin(other)
    val coGroup = list.cogroup(other)

    //action
    val operationSecond = List(subtractByKey, join, intersection, rightOuterJoin, leftOuterJoin, coGroup)
    operationSecond.map(x => x.foreach(println))

  }
}