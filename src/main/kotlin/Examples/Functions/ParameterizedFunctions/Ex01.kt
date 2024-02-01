package Examples.Functions.ParameterizedFunctions

val array = intArrayOf(1,2,3,4,5,6)
fun IntArray.indexOf(e: Int): Int {
    for (i in 0..< this.size){
        if (this[i] == e) {
            return i
        }
    }
    return -1
}



fun main() {
   val res = array.indexOf(6)
    println("index of element 6 in array $res")
}