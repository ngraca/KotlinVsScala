package com.springernature.slides

import java.io.File

fun readFileToString(file: File): String {
    return file.readText()
}

fun doWithText(
    file: File,
    transFun: (String) -> String
): String = transFun(readFileToString(file))


fun main(args: Array<String>) {
    val text1 = doWithText(File("./text.txt")){ txt ->
        txt.uppercase()
    }
    println(text1)

    val text2 = doWithText(File("./text.txt")) {
        it.uppercase()
    }
    println(text2)
}

