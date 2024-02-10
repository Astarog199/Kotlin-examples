package Examples.Throw

fun fail(): Nothing {
    throw IllegalArgumentException()
}

fun main() {
    fail()
}