package Examples.Functions.HigherOrderFunctions

val array = intArrayOf(2, 3, 4)
fun main() {
    val arrayHasValueMoreThan = any(array, {it > 2}) // первый вариант
    val arrayHasValueMoreThanV2 = any(array) {it > 2} // второй вариант
    val arrayHasValueMoreThanV3 = array.any {it > 2}

    println(arrayHasValueMoreThan) //true
    println(arrayHasValueMoreThanV2)
    println(arrayHasValueMoreThanV3)
}