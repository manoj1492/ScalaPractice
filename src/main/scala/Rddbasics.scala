import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by manojma on 5/16/2017.
  */
object Rddbasics{

  def main(args: Array[String]) :Unit ={
    val sparkContext = new SparkContext(new SparkConf().setAppName("RddBasics").setMaster("local[2]"))
    val lines = sparkContext.textFile("C:\\Users\\ManojMa\\IdeaProjects\\Scalatest\\src\\resources\\WordCount")
    val lineLengths = lines.map(s => s.length)

    println(lineLengths)

    val totalLength = lineLengths.reduce((a, b) => a + b)

    println(totalLength)

  }
}
