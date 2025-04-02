package com.springernature.slides


object Slide4 {
  case class Person(
    val name: String,
    var age: Int = 0
  )
  def main(args: Array[String]): Unit = {
    val jack = Person("Jack", 40)

    jack == Person("Jack", 40)

    val fred = jack.copy(name = "Fred")
  }
}
