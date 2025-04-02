package com.springernature.slides


object Slide14 {
  implicit class RichInt(val value: Int) extends AnyVal {
    def square(): Int = value * value
  }

  def main(args: Array[String]): Unit = {
    println(2.square())
  }
}
