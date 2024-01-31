package Examples.Classes.Ex07_InnerClass


class Value (val left: Double,
            val right: Double){

    fun printPlus() {
        println(left+right)
    }

    inner class Calc{
        fun plus() : Double {
            return left + right
        }

        fun minus() : Double {
            return left - right
        }

        fun print(){
            this@Value.printPlus() // ссылка на внешний класс
        }
    }
}

fun main() {
    val primer = Value(5.0, 10.0).Calc().plus()
    println(primer)
    val primer2 = Value(5.0, 10.0).Calc().minus()
    println(primer2)
    Value(15.0, 3.0).Calc().print()
}