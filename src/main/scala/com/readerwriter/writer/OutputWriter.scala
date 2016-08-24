package com.readerwriter.writer

import org.apache.spark.rdd._
import org.apache.spark._

/**
  * Created by cloudera on 8/5/16.
  */
object OutputWriter {


  def writeFile(filePath: String,textRDD: RDD[(String,Int)]): Unit ={
    textRDD.coalesce(1).saveAsTextFile(filePath)
  }

}
