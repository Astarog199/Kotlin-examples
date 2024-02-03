package Examples.Collection.Set
val mutableSet = mutableSetOf("Blue", "Red") //[Blue, Red]

fun main() {
    mutableSet.addAll(set) //[Blue, Red, Green, Yellow, Orange]
    mutableSet.remove("Orange") //[Blue, Red, Green, Yellow]
    println(mutableSet)
    mutableSet.add("White") //true
    mutableSet.add("White") //false
    println(mutableSet) //[Blue, Red, Green, Yellow, White]
}