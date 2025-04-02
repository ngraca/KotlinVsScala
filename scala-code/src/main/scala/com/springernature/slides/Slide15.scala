package com.springernature.slides

import scala.collection.mutable.ListBuffer

object Slide15 {

  def main(args: Array[String]): Unit = {
    val l1 = Seq(1, 2, 3)

    val l2 = l1 :+ 4

    val m1 = ListBuffer(1, 2, 3)

    m1 :+ 4

    (1 to 3).filter(_ % 2 == 0)

    List(1, 2, 3).sliding(2)
  }
}
