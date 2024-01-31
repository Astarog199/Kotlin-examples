package Examples.Classes.Ex05_Interfaces.Example04

class Holder private constructor( number: Int)
{
    var number: Int = number
        set(value){
            listener?.onNewValue(value)
            field = value
        }
    var listener: ValueChangeListener? = null

    companion object {
        const val DEFAULT_NUMBER = -1
        fun createHolder(defaultNumber: Int): Holder {
            return Holder(defaultNumber)
        }
    }
}