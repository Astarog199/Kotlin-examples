package Examples.Classes.Ex08_Objects.Companions

class RectangleEx3(
    val width: Double,
    val height: Double
) {
    fun calculateSquare() = width * height
    companion object{
        fun createRectangle(width: Double, height: Double): RectangleEx3 {
            return RectangleEx3(width, height)
        }
    }
}
