package Examples.Classes.Ex08_Objects.Companions


class RectangleEx2(
    val width: Double,
    val height: Double
) {
    fun calculateSquare() = width * height
    companion object{
        const val SIZE_WIDTH = 5.0
        const val SIZE_HEIGHT = 5.0
        val oneOnOneRectangle = RectangleEx3(SIZE_WIDTH, SIZE_HEIGHT)
    }
}
