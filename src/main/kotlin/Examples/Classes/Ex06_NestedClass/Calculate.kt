package Examples.Classes.Ex06_NestedClass

fun main() {
    val primer = Plus(Plus.Value(10.0), Plus.Value(10.0))
    val sum = primer.plus()
    println(sum) //20.0
}

//Вложенный класс
class Plus (
    val left: Value,
    val right: Value,
)
{
    class Value(val arg: Double)

    fun plus() : Double {
        return left.arg + right.arg
    }
}


