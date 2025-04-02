package com.springernature.slides

object Slide13 {
  class Animal
  class Dog extends Animal
  class Cat extends Animal

  // Covariant
  class MyList[+T]
  val animals: MyList[Animal] = new MyList[Dog]

  // Contravariant
  class Vet[-T]
  val lassiesVet: Vet[Dog] = new Vet[Animal]

  // Type
  type AnimalList = MyList[Animal]
  val animalsList: AnimalList = animals

}

trait Function1[-T1, +R] extends AnyRef {
  def apply(v1: T1): R
}
