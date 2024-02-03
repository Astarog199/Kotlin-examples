package Examples.Collection.List

val mutableList = mutableListOf<String>("Alice", "Bob")

fun main() {
    mutableList.add("Carol") //[Alice, Bob, Carol]
    mutableList.add(0, "Bob") //[Bob, Alice, Bob, Carol]
    mutableList.set(0, "Bob") //[Bob, Alice, Bob, Carol]
    val wasRemoved = mutableList.remove("Bob") // true
    mutableList.removeAt(1) // [Alice, Carol]
    mutableList[1] = "Bob" //[Alice, Bob]
}