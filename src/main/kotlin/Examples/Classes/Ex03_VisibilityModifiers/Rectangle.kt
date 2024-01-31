package Examples.Classes.Ex03_VisibilityModifiers
/*
public Доступ отовсюду. Применяется по умолчанию

internal Доступ в рамках одного модуля

protected Доступ из текущего класса и его наследников Модификаторы видимости

private Для полей и методов – доступ из текущего класса.
Для объявлений верхнего уровня – доступ из текущего файла

переменные с нижним подчёркиванием (_width) предназначены для использования внутри класса
 */


class Rectangle (
    width: Double,
    height: Double
)
{
    val width: Double get() = _width    //public по умолчанию
    val height: Double get() = _height  //public по умолчанию

    private var _width: Double
    private var _height: Double

    init {
        _width = width
        _height = height
    }

    fun calculateSquare() = width*height
}