package Examples.Classes.Ex04_Inheritance

class Rectangle (
    centerX: Double,
    centerY: Double,
    width: Double,
    height: Double
) : Shape(centerX, centerY)
{
 val width: Double get() = _width
 val height: Double get() = _height

    private var _width: Double
    private var _height: Double

    init {
        _width = width
        _height = height
    }

    override fun calculateSquare() = width*height
}