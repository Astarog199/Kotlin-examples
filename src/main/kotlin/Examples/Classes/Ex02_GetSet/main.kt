package Examples.Classes.Ex02_GetSet

fun print(rectangle: Rectangle) {
    val square = rectangle.getSquare
    val diagonal = rectangle.getDiagonal
    println("Square is $square")
    println("Diagonal is $diagonal")
}

fun main() {
    val rectangle = Rectangle(-5.0, 10.0)
    print(rectangle)
//    Square is 50.0
//    Diagonal is 11.18

    rectangle.height = -3.0 // false
    println("2 height = " + rectangle.height)           // 10.0
    println("2 Square is " + rectangle.getSquare)       //50.0
    println("2 Diagonal is " + rectangle.getDiagonal)   //11.18

    rectangle.height = 3.0 //true
    println("3 height = " + rectangle.height)           // 3.0
    println("3 Square is " + rectangle.getSquare)       //15.0
    println("3 Diagonal is " + rectangle.getDiagonal)   //5.83
}