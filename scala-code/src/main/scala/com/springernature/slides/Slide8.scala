package com.springernature.slides

object Slide8 {

  def main(args: Array[String]): Unit = {
    val greaterThan100 = Math.max(100, _: Int)

    println(greaterThan100(50))

    println(greaterThan100(200))
  }
}
