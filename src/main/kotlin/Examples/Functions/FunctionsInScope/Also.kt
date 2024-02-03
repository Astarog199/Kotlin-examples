package Examples.Functions.FunctionsInScope

import java.awt.Rectangle

val newRectangle2 = Rectangle().also {
    println(it)
}

fun main() {
    println(newRectangle2)
}