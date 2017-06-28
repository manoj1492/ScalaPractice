package sparkContextInitialize

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.log4j.{Level, Logger}


object SparkContextInitialization {
   
    val conf = new SparkConf().setMaster("local").setAppName("My App")
    val sparkContext = new SparkContext(conf)
    val rootLogger = Logger.getRootLogger()
    rootLogger.setLevel(Level.ERROR)
    
    def getSparkContext(): SparkContext = {
      sparkContext
    }
    
}