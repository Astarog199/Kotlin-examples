package Examples.Classes.Ex04_Inheritance

class Circle
    (
    centerX: Double,
    centerY: Double,
    var radius: Double
     ) : Shape(centerX, centerY) {
        override fun calculateSquare() = Math.PI * radius * radius
     }