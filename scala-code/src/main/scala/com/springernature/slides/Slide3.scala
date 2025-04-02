package com.springernature.slides

object Slide3 {
  class Specie(
    val kind: String
  ) {
    def eats(): Seq[String] = Seq()
  }

  class Person(
    val name: String,
    var age: Int = 0
  ) extends Specie("Human") {
    override def eats() = Seq("...")
  }
}
