package Examples.Functions.InlineFunctions


val array = intArrayOf(1,2,3,4,5,6)
inline fun IntArray.forEach(action: (Int) -> Unit) {
    for (e in this){
        action(e)
    }
}




fun main() {
    array.forEach { print(it) }

}