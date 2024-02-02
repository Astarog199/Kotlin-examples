package Examples.Functions.ParameterizedFunctions

val charArray = intArrayOf(1, 2, 3)


    fun <T> Array<T>.indexOf(e: T): Int {
        for (i in 0..<this.size) {
            if (this[i] == e) {
                return i
            }
        }
        return -1
    }
