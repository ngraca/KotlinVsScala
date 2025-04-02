package com.springernature.slides

object Slide2 {
  class Person(
    val name: String,
    var age: Int = 0
  ) {
    def sayHi() = "Hi"
    def +(lifetime: Int): Person = {
      age += lifetime
      this
    }
  }

  object Person {
    def newBorn(name: String) =
      new Person(name, 0)
  }
}
