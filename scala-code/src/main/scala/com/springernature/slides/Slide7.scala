package com.springernature.slides

object Slide7 {

  def modN(n: Int)(x: Int): Boolean = (x % n) == 0

  def main(args: Array[String]): Unit = {
    val mod2 = modN(2)(_)

    val result1 = mod2(6)
    println(result1)

    val result2  = Seq(1, 2, 3, 4) filter mod2
    println(result2)
  }
}
