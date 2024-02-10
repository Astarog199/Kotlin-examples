package Examples.Decorator

val expensiveComputation by lazy{
   summ(4, 55)
}


class summ(arg1: Int, arg2: Int) {
    var res : Int

    init {
        res = arg1 + arg2
        println("init")
    }
}

fun main() {
    println("Enter main()")
    println(expensiveComputation.res)
}

//Enter main()
//init
//59