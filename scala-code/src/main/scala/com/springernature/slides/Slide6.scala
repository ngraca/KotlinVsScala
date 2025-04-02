package com.springernature.slides

import java.io.{File, FileWriter}
import scala.io.Source

object Slide6 {

  def writeStringToFile(file: File, block: String): Unit = {
    val fileWriter = new FileWriter(file)
    fileWriter.write(block)
    fileWriter.close()
  }

  def writeToFile(file: File, block: => String): Unit = {
    if(file.isFile)
      writeStringToFile(file, block)
  }

  def main(args: Array[String]): Unit = {
    val file = new File("./text.txt")
    file.createNewFile()
    writeToFile(file, "Scala rocks! " * 1000)
  }
}
