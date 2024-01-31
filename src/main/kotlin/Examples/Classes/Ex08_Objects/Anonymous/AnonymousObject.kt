package Examples.Classes.Ex08_Objects.Anonymous

interface LoadCallback {
    fun onLoadStarted()
    fun onLoadFinished()
}

val loadCallback = object : LoadCallback {
    override fun onLoadStarted() {
        println("loadCallback: Начало")
    }

    override fun onLoadFinished() {
        println("loadCallback: Конец")
    }
}