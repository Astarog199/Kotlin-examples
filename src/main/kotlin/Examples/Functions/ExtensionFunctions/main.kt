package Examples.Functions.ExtensionFunctions

fun main() {
    val rectangle=Rectangle(2.0, 3.0)
    if (isSizeValid(rectangle)){
        println("Test")
    }

    // Функции-Расширения: могут вызываться, как члены класса,
    // но определены за его пределами
    if (rectangle.isSizeValid()){
        println("Функции-Расширения")
    }

    // Класс, к которому применяется функция-расширение,
    // называется получателем.
    val rectangleX2 = rectangle.scaled(2.0)
    println(rectangleX2)

    //Свойства-расширения
    if (rectangle.square > 5.0) {
        println("rectangle square ${rectangle.square}")
    }

    //Функции-расширения не наследуются. Они применяются строго к
    //тому классу, для которого объявлены.
    //Из функций-расширений нельзя получить доступ к private и protected членам класса.
    //Функции-расширения можно применять к nullable типам.

    drawRectangle(null)
    drawRectangle(rectangle)
}