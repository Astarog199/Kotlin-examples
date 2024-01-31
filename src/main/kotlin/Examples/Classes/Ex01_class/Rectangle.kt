package Examples.Classes.Ex01_class

import kotlin.math.sqrt

class Rectangle (var width: Double, var height: Double) {
    var diagonal: Double
    init {
        diagonal = sqrt(width * width + height * height)
    }

    fun calculateSquare() = width * height

    fun getDiag() : Double{
        return diagonal
    }
}