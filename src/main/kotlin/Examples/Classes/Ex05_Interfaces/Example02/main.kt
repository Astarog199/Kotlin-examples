package Examples.Classes.Ex05_Interfaces.Example02

fun print(shape: Shape) {
    val square = shape.calculateSquare()
    println("Square is $square")
}


fun main() {
    val  rectangle = Rectangle(0.0, 0.0,  10.0,  10.0)
    print(rectangle) // Square is 100.0
//    rectangle.scaleBy(10.0)
//    print(rectangle) // Square is 10000.0
//    rectangle.scaleHeightBy(3.0)
//    rectangle.scaleHeightBy(10.0)
//    print(rectangle) // Square is 3000.0
    rectangle.scaleBy(1.5)
    print(rectangle) //Square is 225.0
}