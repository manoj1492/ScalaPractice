import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by manojma on 5/30/2017.
  */
object BasicSpark {

  def main(args: Array[String]):Unit ={

    val sparkContext = new SparkContext(new SparkConf().setAppName("RddBasics").setMaster("local[2]"))

    val orders = sparkContext.textFile("C:\\Users\\ManojMa\\IdeaProjects\\data\\retail_db\\orders")

    orders.take(10).foreach(println)

  }
}
