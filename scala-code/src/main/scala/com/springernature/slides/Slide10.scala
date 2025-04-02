package com.springernature.slides

object Slide10 {

  def matchAll(p: Any): String = {
    p match {
      case x: Int => s"$x"
      case "Scala" => "Scala"
      case Seq(_, 3, _*) => "Seq(?, 3, *)"
      case head :: tail => s"$head $tail"
      case (firstEl, _) => s"$firstEl"
      case Some(s: Long) => s"Some Long $s"
      case x: Int if 1 to 10 contains x => s"$x"
      case _ => "The default"
    }
  }

  def main(args: Array[String]): Unit = {
    println(matchAll(5))
    println(matchAll("Scala"))
    println(matchAll(Seq(1, 3)))
    println(matchAll(Seq(1, 3, 5)))
    println(matchAll(Seq(1, 2, 5)))
    println(matchAll(("elem", 6)))
    println(matchAll(Some(6L)))
    println(matchAll("Scala!"))
    println(matchAll(None))
  }

}
