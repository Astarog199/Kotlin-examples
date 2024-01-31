package Examples.Classes.Ex08_Objects.Companions

class Rectangle(
    val width: Double,
    val height: Double
) {
    fun calculateSquare() = width * height
    companion object{
     val oneOnOneRectangle = Rectangle(10.0, 10.0)
    }
}