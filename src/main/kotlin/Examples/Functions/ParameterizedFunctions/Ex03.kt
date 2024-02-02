package Examples.Functions.ParameterizedFunctions

fun <T : Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

fun main() {
    var res = sum(10, 3)
    println(res)
}