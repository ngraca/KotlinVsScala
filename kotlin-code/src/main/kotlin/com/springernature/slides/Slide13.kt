package com.springernature.slides

open class Animal
class Dog: Animal()
class Cat: Animal()

class MyList<out T>
val animals: MyList<Animal> = MyList<Dog>()

class Vet<in T>
val lassiesVet: Vet<Dog> = Vet<Animal>()

typealias AnimalList = MyList<Animal>
val animalsList: AnimalList = animals
