package Examples.Classes.Ex05_Interfaces.Example02

import Examples.Classes.Ex05_Interfaces.Example01.ScalableRectangle


class Rectangle (
    centerX: Double,
    centerY: Double,
    override var width: Double,
    override var height: Double
) : Shape(centerX, centerY), ScalableRectangle, HorizontalScalable, VerticalSclable {
    private var currentScale = 1.0
    override fun calculateSquare() = width*height

    override fun scaleBy(x: Double) {
        super.scaleBy(x) // Ссылка на interface ScalableRectangle
        currentScale *= x
    }
}