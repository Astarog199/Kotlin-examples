package TEST.Ex01
/*
Задание №2 “Дописать функции”

Реализовать функции sumAll, createOutputString и multiplyBy
так, чтобы программа выводила следующие строчки.
sumAll = 26
sumAll = 0
sumAll = 27
Alice has age of 42
Bob has age of 23
student Carol has age of 19
Daniel has age of 32
null
12
*/
fun main() {
    println("sumAll = ${sumAll(1, 5, 20)}")
    println("sumAll = ${sumAll()}")
    println("sumAll = ${sumAll(2, 3, 4, 5, 6, 7)}")

    println(createOutputString("Alice"))
    println(createOutputString("Bob", 23))
    println(createOutputString(isStudent = true, name = "Carol", age = 19))
    println(createOutputString("Daniel", 32, isStudent = null))

    println(multiplyBy(null, 4))
    println(multiplyBy(3, 4))
}

fun sumAll(vararg number: Int): Int {
    var sum = 0;
    for(i in number){
        sum += i
    }
    return sum
}


fun createOutputString(name: String, age: Int = 42, isStudent: Boolean? = null): String{
    if(isStudent == true){
        return String.format("student $name has age of $age ")
    } else{
        return String.format("$name has age of $age ")
    }

}

fun multiplyBy(arg1: Int?, arg2: Int?): Int? {

    return if(arg1 != null && arg2 != null){
        arg1 * arg2
    }else{
        null
    }
}