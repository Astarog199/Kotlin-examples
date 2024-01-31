package Examples.Functions.Ex02_LambdaExpressions

import Examples.Functions.HigherOrderFunctions.any
import java.awt.Rectangle

/*
Лямбда-выражения в Kotlin - это способ создания анонимных функций.
Они используются для создания функций, которые не имеют имени и которые
могут быть использованы только один раз.
 */

val rectangle= Rectangle(2, 3)
val squareCalc: Rectangle.() -> Int = {
    this.width * this.height
}

val list = listOf(1, 2, 3, 4, 5)


fun main() {
    val result2 = add2(3, 4)
    println(result2)

    val result4 = invert(44)
    println(result4)

    val result5 = list.filter { it > 2 }
    println(result5)


    val sqare = rectangle.squareCalc()
    println("sqare: $sqare")
}