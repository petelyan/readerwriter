package com.readerwriter.reader.test

import org.scalatest._
import org.apache.spark._
import com.readerwriter.reader._
/**
  * Created by cloudera on 8/4/16.
  */
class InputReaderTest extends FunSuite with Matchers with BeforeAndAfter{

  var context: SparkContext = _
  //initialize SparkContext
  before{
    val conf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("input-reader-test")

    context = new SparkContext(conf)
  }

  after{
    context.stop()
  }


  test("empty file path should produce empty RDD")
  {
    val filePath = ""
    // val context = new SparkContext("local","Input Reader")

    //val inputReader = new InputReader

    val fileRDD = InputReader.getFileRDD(context,filePath)

    assert(fileRDD.first().isEmpty)

  }

}
