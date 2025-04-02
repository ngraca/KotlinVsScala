package com.springernature.slides

data class Person(
    val name: String,
    val age: Int
)

fun main() {
    val john = Person("John", 42)

    val (name, age) = john

    fun component1() = name
    fun component2() = age
}
