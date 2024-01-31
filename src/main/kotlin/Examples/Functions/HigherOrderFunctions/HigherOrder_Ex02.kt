package Examples.Functions.HigherOrderFunctions

/**
 *  функция-расширения массива
 */
fun IntArray.any(predicate: (Int) -> Boolean) : Boolean {
    for (e in this) {
        if (predicate(e)) return true
    }
    return false
}