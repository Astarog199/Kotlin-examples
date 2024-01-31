package Examples.Classes.Ex06_NestedClass




fun main() {
    val rectangle = Rectangle(Rectangle.Point(0.0, 0.0), Rectangle.Point(10.0, 10.0))
}

//Вложенный класс
class Rectangle (
    val topLeft: Point,
    val bottomRight: Point
){
    class Point(val x: Double, val y: Double)
}