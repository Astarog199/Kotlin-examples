package Examples.Functions.ParameterizedFunctions

class ValueHolder<T> (var valueArr: T)


fun main() {
    val arrValue = ValueHolder(charArrayOf('1','2','3'))
}