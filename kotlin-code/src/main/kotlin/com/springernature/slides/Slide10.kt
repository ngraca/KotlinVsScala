package com.springernature.slides

fun matchAll1(p: Any?): String =
    when(p) {
        is Int                  -> "$p"
        "Kotlin"                -> "Kotlin"
        Pair("literal", "only") -> "..."
        is Long?                -> "null or Long"
        in 1..10                -> "Value in 1..10"
        else                    -> "The default"
    }


fun matchAll2(p: Any?): String = when {
    p is String && p.endsWith("!")  -> "$p"
    else                            -> "The default"
}