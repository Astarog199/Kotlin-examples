package Examples.Classes.Ex05_Interfaces.Example02

interface VerticalSclable {
    var height: Double
    fun scaleHeightBy(x: Double){
        height *=x
    }
}