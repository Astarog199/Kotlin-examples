package Examples.Classes.Ex05_Interfaces.Example02

abstract class Shape(
    var centerX: Double,
    var centerY: Double
){
    fun moveBy(dx: Double, dy: Double){
        centerX += dx
        centerY += dy
    }
    abstract fun calculateSquare(): Double
}