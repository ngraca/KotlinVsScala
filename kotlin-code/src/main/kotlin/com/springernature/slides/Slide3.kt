package com.springernature.slides

open class Specie(
    val kind: String
) {
    open fun eats(): List<String> = emptyList()
}

class Person3(
    val name: String,
    var age: Int = 0
): Specie("Human") {
    override fun eats() = listOf("...")
}