package Examples.Classes

class ValueHolder<T>(var value: T) {
    fun getValueArr(): T {
        return value
    }

}


fun main() {

    val Holder : ValueHolder<Int> = ValueHolder <Int> (7)
    println(Holder.getValueArr())
}