package Examples.Functions.Ex01_Extension

// Функция
fun isSizeValid(rectangle: Rectangle) : Boolean {
    return rectangle.width>0 && rectangle.height > 0
}