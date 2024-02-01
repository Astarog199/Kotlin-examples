package Examples.Functions.AnonymousFunctions



val array = intArrayOf(2, 3, 4)
val add:(Int, Int) -> Int = fun (a: Int, b: Int) = a + b


/**
 *Возвращает true, если хотя бы один элемент массива  соответствует заданному значению.
 *
 * public inline fun IntArray.any(predicate: (Int) -> Boolean): Boolean {
 *     for (element in this) if (predicate(element)) return true
 *     return false
 * }
 *
 */
val arrayHasValueMoreThan2 = array.any( fun (a: Int): Boolean {
    return a > 2
})

fun main() {
    println(add(2,2))
    println(arrayHasValueMoreThan2)
}