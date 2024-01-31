package Examples.Functions.HigherOrderFunctions

/**
 * функция проверяет, есть ли в массиве число, большее 2
 */
fun any(array: IntArray, predicate:(Int) -> Boolean) :Boolean {
    for(e in array){
        if (predicate(e)) return true
    }
    return false
}
