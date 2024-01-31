package Examples.Classes.Ex05_Interfaces.Example02

interface HorizontalScalable {
    var width: Double
    fun scaleWidthBy(x: Double){
        width *=x
    }
}