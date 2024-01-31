package Examples.Classes.Ex04_Inheritance

abstract class Shape(
    var centerX: Double,
    var centerY: Double
){
    fun maoveBy(dx: Double, dy: Double){
        centerX += dx
        centerY += dy
    }

    abstract fun calculateSquare(): Double
}