package Examples.Functions.ParameterizedFunctions

class ValueHolder <T : Any>(var value: T){
    fun updateValue(newValue: T) : T {
        if (
            newValue.hashCode() != value.hashCode() || newValue != value
        ){
            value=newValue
        }
        return value
    }
}

fun main() {
    val Holder: ValueHolder <Int> = ValueHolder(10)
    println(Holder.value)
    println(Holder.updateValue(4))
}