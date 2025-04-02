package com.springernature.slides

data class Person4(
    val name: String,
    var age: Int = 0
)

fun main() {
    val jack = Person4("Jack", 40)

    jack == Person4("Jack", 40)

    val fred = jack.copy(name = "Fred")
}


