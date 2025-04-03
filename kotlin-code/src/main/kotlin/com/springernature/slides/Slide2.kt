package com.springernature.slides

class Person2(
    val name: String,
    var age: Int = 0
) {
    fun sayHi(): String = "Hi"

    operator fun plus(lifetime: Int): Person2 {
        age += lifetime
        return this
    }

    companion object {
        fun newBorn(name: String) =
            Person2(name, 0)
    }
}

fun main() {
    val john = Person2.newBorn("John")
    john + 10
    println("person: ${john.name}, age: ${john.age}")
}
