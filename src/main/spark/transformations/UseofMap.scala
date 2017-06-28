package transformations

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import sparkContextInitialize.SparkContextInitialization

object UseofMap {

  def main(args: Array[String]) {

    val sc = SparkContextInitialization.getSparkContext()
    val input = sc.parallelize(List(1, 2, 3, 4))
    val result = input.map(x => x * x)
    result.persist(StorageLevel.DISK_ONLY)// Data caching for avoiding re-computation of RDD
    println(result.count())
    println(result.collect().mkString(","))// Makes a String output of the result with comma as a seperator
  }

}