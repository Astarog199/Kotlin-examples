package Examples.Classes.Ex08_Objects.Singletons

//Singleton
object AppSettings {
    var lastLogin: String?=null

    fun save() {
        println("$lastLogin be save")
    }
}