package com.springernature.slides

case class Person(name: String, age: Int)

object Person {
  def unapply(person: Person): Option[(String, Int)] =
    Some((person.name, person.age))
}

object Slide11 {
  def main(args: Array[String]): Unit = {
    val john = Person("John", 42)
    val Person(name, age) = john

    println(s"$name $age")
  }
}
