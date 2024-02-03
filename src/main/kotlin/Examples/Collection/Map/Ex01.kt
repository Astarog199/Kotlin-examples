package Examples.Collection.Map

val map = mapOf("Uk" to "London", "France" to "Paris")

fun main() {
    println(map)
   val capitalUk = map["Uk"] //London

    val mutableMap = mutableMapOf("Alice" to 23, "Bob" to 35) //{Alice=23, Bob=35}
    mutableMap["Carol"] = 29
    mutableMap["Alice"] = 24

    println(mutableMap) // {Alice=24, Bob=35, Carol=29}

    for (entry in mutableMap.entries) {
        val (key, value) = entry
        println("$key -> $value")
    }

//    Alice -> 24
//    Bob -> 35
//    Carol -> 29

}