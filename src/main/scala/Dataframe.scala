import org.apache.spark.sql.SparkSession
/**
  * Created by manojma on 5/25/2017.
  */
object Dataframe {

  def main(args: Array[String]):Unit ={
    val session = SparkSession.builder().master("local").appName("Spark SQL Basic").config("Spark.some.config.option", "some-value").getOrCreate()
    val df = session.read.option("header", "true").csv("C:\\Users\\ManojMa\\IdeaProjects\\Scalatest\\src\\resources\\FL_insurance_sample.csv")
    df.show()
  }
}
