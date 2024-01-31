package Examples.Classes.Ex08_Objects

import Examples.Classes.Ex08_Objects.Anonymous.loadCallback
import Examples.Classes.Ex08_Objects.Companions.Rectangle
import Examples.Classes.Ex08_Objects.Companions.RectangleEx2
import Examples.Classes.Ex08_Objects.Companions.RectangleEx3
import Examples.Classes.Ex08_Objects.Singletons.AppSettings


fun main() {
    loadCallback.onLoadStarted()    //loadCallback: Начало
    loadCallback.onLoadFinished()  //loadCallback: Конец

    val exRectangle = Rectangle.oneOnOneRectangle
    println(exRectangle.calculateSquare()) //100

    val exRectangle2 = RectangleEx2.oneOnOneRectangle
    println(exRectangle2.calculateSquare()) //25.0

    val exRectangle3 = RectangleEx3.createRectangle(2.0, 3.0)
    println(exRectangle3.calculateSquare()) //6.0

    AppSettings.lastLogin ="user"
    AppSettings.save()
}
