package Examples.Functions.InlineFunctions

val array3 = intArrayOf(5,6,7,8,9,10)
fun caller2(): Int {
    array3.forEach {
        if (it < 8){
            return@forEach
        }
        print(it)
    }
    return 0
}

fun main() {
    caller2() //8 9 10
}