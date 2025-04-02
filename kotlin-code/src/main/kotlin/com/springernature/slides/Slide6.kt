package com.springernature.slides

import java.io.File

fun writeStringToFile(file: File, block: String) {
    file.writeText(block)
}

fun writeToFile(
    file: File,
    block: () -> String
) {
    if (file.isFile)
        writeStringToFile(file, block())
}

fun main() {
    val file = File("./text.txt")
    file.createNewFile()
    writeToFile(file) {
        "Kotlin rocks! ".repeat(1000)
    }
}
