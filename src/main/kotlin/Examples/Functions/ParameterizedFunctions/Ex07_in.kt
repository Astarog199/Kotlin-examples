package Examples.Functions.ParameterizedFunctions

interface Consumer<in T>{
    fun consume(value: T)
}

class NumberConsumer: Consumer <Number> {
    override fun consume(value: Number) {
        println(value)
    }
}

fun doWithConsumer(numberConsumer: Consumer<Number>, value: Number) {
    numberConsumer.consume(value)
}

fun main() {
    val numberConsumer = NumberConsumer()
    doWithConsumer(numberConsumer, 150)
}