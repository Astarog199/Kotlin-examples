package Examples.Classes.Ex05_Interfaces.Example01

interface Scalable {
    fun scaleBy(x: Double)
    fun scaleByTwo() = scaleBy(2.0)
}