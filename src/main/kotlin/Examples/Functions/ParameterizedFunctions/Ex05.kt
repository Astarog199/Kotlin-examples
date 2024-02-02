package Examples.Functions.ParameterizedFunctions

fun someFun(holder: ValueHolder<*>){
    otherFun(holder)
    val holderValue: Any = holder.value
    val newValue: Any = 42


}

fun otherFun(holder: ValueHolder<*>) {

}

