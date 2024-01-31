package Examples.Classes.Ex05_Interfaces.Example01

class Rectangle (
    centerX: Double,
    centerY: Double,
    override var width: Double,
    override var height: Double
) : Shape(centerX, centerY), ScalableRectangle {

    override fun calculateSquare() = width*height
}