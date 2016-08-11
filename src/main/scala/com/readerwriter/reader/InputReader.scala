package com.readerwriter.reader


import org.apache.spark.rdd._
import org.apache.spark._


/**
  * Created by cloudera on 8/4/16.
  */
object InputReader {

  //class that encapsulates the reading of files from the hdfs and returns an RDD


  def getFileRDD(context: SparkContext,filePath: String):RDD[String] =
  {
    val fileRDD: RDD[String] = context.parallelize(Seq[String](""))

    if(filePath.isEmpty)
      fileRDD
    else



      context.textFile(filePath)


  }

}
