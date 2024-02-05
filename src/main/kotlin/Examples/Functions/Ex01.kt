package Examples.Functions

//сылка на функции. Оператор ::
/**
 * Функция 'isOdd' проверяет, является ли число нечетным, возвращая true, если число не делится на 2 без остатка.
 */
fun isOdd(a: Int): Boolean{
    return a % 2  == 1
}

class A(val a: Int) {
    /**
     * функция 'isMyValue' проверяет, равно ли значение 'a' переданному в функцию числу.
     */
    fun isMyValue(a: Int) : Boolean = this.a == a
}

fun main(){
    val array = intArrayOf(2, 3, 4)

    val arrayHasOddValue = array.any ( ::isOdd )

    val a = A(3)
    val arrayHasValueOfA = array.any ( a :: isMyValue )

    println(arrayHasOddValue) //true
    println(arrayHasValueOfA) //true
}



