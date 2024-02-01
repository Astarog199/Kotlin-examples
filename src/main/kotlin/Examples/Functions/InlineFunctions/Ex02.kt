package Examples.Functions.InlineFunctions

val array2 = intArrayOf(3,4,5,6)
fun caller(): Int {
    array2.forEach {
        println(it)
        return it
    }
    return 0
}

fun main() {
    caller()
}