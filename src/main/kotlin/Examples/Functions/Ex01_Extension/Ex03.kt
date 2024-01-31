package Examples.Functions.Ex01_Extension

fun Rectangle.scaled(scale: Double): Rectangle{
    return Rectangle(width * scale, height * scale)
}