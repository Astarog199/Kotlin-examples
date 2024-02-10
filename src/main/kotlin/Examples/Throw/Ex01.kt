package Examples.Throw

fun processComand(command: String) {
    when(command){
        "send" -> send()
        "receive" -> receive()
        else -> {
            val  e = IllegalArgumentException()
            throw e
        }
    }
}

fun receive() {
    println("Функция receive")
}

fun send() {
    TODO("Not yet implemented")
}

fun main() {
    processComand("receive")
    processComand("sfsf")
}