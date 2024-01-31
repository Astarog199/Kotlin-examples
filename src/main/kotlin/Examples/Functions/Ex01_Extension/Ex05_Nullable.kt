package Examples.Functions.Ex01_Extension

//Функции-расширения с nullable получателем

fun Rectangle?.orEmpty(): Rectangle {
    return this ?: Rectangle(0.0, 0.0)
}

fun drawRectangle(rectangle: Rectangle?){
    val width = rectangle.orEmpty().width
    val height = rectangle.orEmpty().height
    println("width: $width, height: $height")
}