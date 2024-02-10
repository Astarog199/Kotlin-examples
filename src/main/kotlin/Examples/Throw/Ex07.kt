package Examples.Throw

//Задание №2 “Обработка исключений”
//Семинар 4. Продвинутый Kotlin
//1. Написать программу, которая принимает два аргумента командной
//строки и вычисляет их сумму.
//2. Написать свой класс исключения NotIntArgumentException(arg: String)
//3. Для вычисления суммы реализовать функцию
//sum(a: String, b: String): Int
//4. В этой функции, при преобразовании строки в число, обработать
//исключение NumberFormatException и заменить его на
//NotIntArgumentException.
//5. В функции main, при вызове функции sum, обработать как
//NotIntArgumentException, так и IndexOutOfBoundsException (оно
//возникнет при обращении к массиву args по индексу в случае, если было
//передано менее двух аргументов командной строки).

class NotIntArgumentException(arg: String) : RuntimeException(arg)

fun sum(a: String, b: String): Int {
    val arg1 = a.parseIntOrnull()
    val arg2 = b.parseIntOrnull()

    return arg1.plus(arg2)
}


fun String.parseIntOrnull(): Int {
    return try {
        Integer.parseInt(this)
    } catch (e: NumberFormatException) {
        throw NotIntArgumentException("Некорректный аргумент")
    }
}

var args = arrayOf("12", "kk")
fun main() {
    try {
        println(sum(args[0], args[1]))
    } catch (e: IndexOutOfBoundsException) {
        println("Передано менее двух аргументов")
    }
}
