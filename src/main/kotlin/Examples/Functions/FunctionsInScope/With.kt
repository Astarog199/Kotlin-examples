package Examples.Functions.FunctionsInScope

val rectangle = Rectangle(2.0, 3.0)

val square = with (rectangle){
    calculateSquare()
}


fun main() {
    println(square)

}