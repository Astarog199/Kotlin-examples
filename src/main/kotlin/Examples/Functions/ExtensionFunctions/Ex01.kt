package Examples.Functions.ExtensionFunctions

// Функция
fun isSizeValid(rectangle: Rectangle) : Boolean {
    return rectangle.width>0 && rectangle.height > 0
}