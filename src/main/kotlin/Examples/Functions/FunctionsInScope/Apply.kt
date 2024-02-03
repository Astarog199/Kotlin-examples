package Examples.Functions.FunctionsInScope

import java.awt.Rectangle

val newRectangle = Rectangle().apply {
    width = 9
    height = 9
}

fun main() {
    println(newRectangle)
}