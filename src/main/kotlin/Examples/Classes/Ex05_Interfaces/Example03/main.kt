package Examples.Classes.Ex05_Interfaces.Example03

//Задание №2 “Иерархия классов”

//Построить иерархию классов таким образом, чтобы после
//выполнения функции main был выведен корректный результат
//вычисления 3 формул. 15 минут


fun main() {
    // Соответствует формуле 4 + 2.5 * 2
    printOperationResult(Plus(Value(4.0), Multiply(Value(2.5), Value(2.0))))

    // Соответствует формуле (1 + 3.5) * (2.5 + 2)
    printOperationResult(
        Multiply(
            Plus(Value(1.0), Value(3.5)),
        Plus(Value(2.5), Value(2.0))
        )
    )

    // Соответствует формуле 10
    printOperationResult(Value(10.0))
}
fun printOperationResult(operation: Operation) {
    val result = operation.calculate()
    println(result)
}