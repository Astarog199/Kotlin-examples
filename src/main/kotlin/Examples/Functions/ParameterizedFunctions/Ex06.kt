package Examples.Functions.ParameterizedFunctions

interface Producer<out T> {
    fun produce(): T
}

interface Consumer<in T>{
    fun consume(value: T)
}

fun doWithProducer(intProducer: Producer<Int>) {
    var numberProducer: Producer<Number> = intProducer
}

fun doWithConsumer(numberConsumer: Consumer<Int>) {
    var intConsumer: Consumer<Int> = numberConsumer
}

fun main() {
    val producer: Producer<Int> = object : Producer<Int> {
        override fun produce(): Int {
            return 1
        }
    }

  doWithProducer(producer)
}