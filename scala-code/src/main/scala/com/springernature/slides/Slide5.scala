package com.springernature.slides

import java.io.{File, FileReader}
import scala.io.Source

object Slide5 {
  def readFileToString(file: File): String =
    Source.fromFile(file).mkString

  def doWithText(
    file: File,
    transFun: String => String
  ): String =
    transFun(readFileToString(file))

  def main(args: Array[String]): Unit = {
    val text1 = doWithText(
      new File("./text.txt"),
      txt => txt.toUpperCase()
    )
    println(text1)

    val text2 = doWithText(
      new File("./text.txt"),
      _.toUpperCase()
    )
    println(text1)
  }
}
