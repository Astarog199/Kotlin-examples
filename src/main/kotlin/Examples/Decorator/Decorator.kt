package Examples.Decorator

interface LifecycleListenner{
    fun onResume(){
        println("Resume")
    }

    fun onPause(){
        println("Pause")
    }
}


class Decorator(val innerLifecycleListenner: LifecycleListenner): LifecycleListenner by innerLifecycleListenner{
    override fun onResume() {
        println("Переопределение onResume")
    }
    override fun onPause() {
        println("Переопределение onPause")
    }
}

fun main() {
    val d = Decorator(object : LifecycleListenner{
        override fun onResume() {
            println("Дополнительная функциональность при вызове onResume")
        }

        override fun onPause() {
            println("Дополнительная функциональность при вызове onPause")
        }
    })

    d.onResume() //Переопределение onResume
    d.innerLifecycleListenner.onResume() //Дополнительная функциональность при вызове onResume

    d.onPause() //Переопределение onPause
    d.innerLifecycleListenner.onPause() //Дополнительная функциональность при вызове onPause
}