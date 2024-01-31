package Examples.Classes.Ex03_VisibilityModifiers

fun print(rectangle: Rectangle) {
    val square = rectangle.calculateSquare()
    println("Square is $square")
}

fun main() {
    val rectangle = Rectangle(5.0,5.0)
    print(rectangle)
}