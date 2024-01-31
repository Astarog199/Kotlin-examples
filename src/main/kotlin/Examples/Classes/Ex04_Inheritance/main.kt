package Examples.Classes.Ex04_Inheritance

fun print(shape: Shape) {
    val square = shape.calculateSquare()
    println("Square is $square")
}


fun main() {
    val  rectangle = Rectangle(0.0, 0.0,  10.0,  10.0)
    print(rectangle)
    val  circle = Circle(3.0, 3.0, 5.0)
    print(circle)
}