package Examples.HelloWorld.Ex03_Functions

fun main(){
    //примеры объявления функций
    val res: Int = sun(3,2)
    println(res)

    val res2: Int = neg(res)
    println(res2)

    val res3: Int = mult(3,2)
    println(res3)

    //Функции типа Unit
    print1()
    print2()
    doNothing()

    first("Bob")

    greetNames("Alice", "Bob", "Carol")
}