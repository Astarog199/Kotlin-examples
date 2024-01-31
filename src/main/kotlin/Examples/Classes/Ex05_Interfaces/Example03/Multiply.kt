package Examples.Classes.Ex05_Interfaces.Example03

class Multiply(val left: Operation, val right: Operation): Operation
{
    override fun calculate() = left.calculate() * right.calculate()
}