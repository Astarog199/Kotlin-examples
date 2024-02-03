package Examples.Functions.FunctionsInScope




val square2 = Rectangle(0.0, 0.0).run {
    width = 4.0
    height = 2.5
    calculateSquare()
}

fun main() {
    println(square2)
}