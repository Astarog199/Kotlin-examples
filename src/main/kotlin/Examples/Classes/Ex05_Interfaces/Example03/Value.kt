package Examples.Classes.Ex05_Interfaces.Example03

class Value(value: Double): Operation {
    var value: Double

    init {
        this.value = value
    }
    override fun calculate(): Double{
        return value
    }
}