package Examples.HelloWorld.Ex03_Functions

fun greetNames(vararg names: String) {
    val firstName = if(names.size > 0) {
        println(names[0])
        println(names[2])
    }else null
}