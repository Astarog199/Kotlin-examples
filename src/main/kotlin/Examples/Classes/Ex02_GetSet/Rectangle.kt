package Examples.Classes.Ex02_GetSet

import kotlin.math.sqrt

class Rectangle(
    width: Double,
    height: Double
)
{
    var calcDiagonal: Double
    var calcSquare: Double

    var width: Double = width
        get() = if (field < 0.0) field * -1.0 else field
        set (value){
            if (value > 0.0){
                field = value
                _diagonal = calcDiagonal()
                _square = calcSquare()
            }
        }

     var height: Double = height
         get() = if (field < 0.0) field * -1.0 else field
         set (value){
            if (value > 0.0){
                field = value
                _diagonal = calcDiagonal()
                _square = calcSquare()
            }
        }

    val getDiagonal: Double
        get() = _diagonal

    val getSquare: Double
        get() = _square

    private var _diagonal: Double
    private var _square: Double

    init {
        calcDiagonal = calcDiagonal()
        calcSquare = calcSquare()
        _diagonal = calcDiagonal
        _square = calcSquare
    }

    private fun calcSquare() = width * height
    private fun calcDiagonal() = sqrt(width * width + height * height)
}