package Examples.Functions.ExtensionFunctions

fun Rectangle.scaled(scale: Double): Rectangle{
    return Rectangle(width * scale, height * scale)
}