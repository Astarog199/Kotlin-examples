package Examples.Functions.ParameterizedFunctions

interface Producer<out T> {
    fun produce(): T
}

class IntProducer: Producer<Int> {
    override fun produce(): Int {
        return 10
    }
}

fun doWithProducer(argument: Producer<Number>):Number {
    return argument.produce()
}

fun <T> doWithProducer2(argument: Producer<T>): T {
    return argument.produce()
}

fun main() {
    val printInt = IntProducer()

    doWithProducer(printInt)
    doWithProducer2(printInt)
}