package Examples.Decorator

interface LifecycleListenner{
    fun onResume(){
        println("Resume")
    }

}


class Decorator(val innerLifecycleListenner: LifecycleListenner): LifecycleListenner by innerLifecycleListenner{
    override fun onResume() {
        println("Переопределение onResume")
    }

}

fun main() {
    val d = Decorator(object : LifecycleListenner{
        override fun onResume() {
            println("Дополнительная функциональность при вызове onResume")
        }
    })

    d.onResume() //Переопределение onResume
    d.innerLifecycleListenner.onResume() //Дополнительная функциональность при вызове onResume
}