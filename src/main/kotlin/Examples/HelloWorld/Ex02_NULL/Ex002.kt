package Examples.HelloWorld.Ex02_NULL

/*
Методы работы с исключением типа null
*/
fun main() {
    /*
    Операторы ?. и ?:

    ?.
    Вызывает метод только в том случае, если объект слева от
    оператора не равен null. Если он null, то и всё выражение
    принимает значение null
    musicTrack?.getAlbum()?.getArtist()?.getName()
     */

    //Оператор ?:
    processStr("null.km");   //true
    processStr("file.txt"); //false

    processStr2("null.km");  //true
    processStr2("file.txt"); //false

    ex01("test", 123); // Аналог типа Object из Java
    println()

    ex02()

}

fun processStr(strOrNull: String?){
    val iskm = if(strOrNull != null) {
        strOrNull.endsWith("km")
    }else{
        false
    }
    println("processStr: $iskm")
}

/*
     ?:
     Справа от ?: указывается значение, которое надо
     использовать в случае, если слева от этого
     оператора оказалось значение null. И только в
     этом случае вызывается код, написанный справа
     от оператора
*/

fun processStr2(strOtNull: String?) {
    val isKm = strOtNull?.endsWith("km") ?: false
    println("processStr2: $isKm")
}

/**
 * Типы Any и Any?
 * Аналог типа Object из Java
 * • Any может принимать значения всех типов, без вопросика.
 * • Any? может принимать значения Any и null, то есть любое значение, возможное в Kotlin.
 */
fun ex01(arg1: Any, arg2: Any){
    var any: Any
    any =23
    any = arg1
    println(any)

    var anyForNull: Any?
    anyForNull = null
    anyForNull = arg2
    println(anyForNull)
}

fun ex02(){
    lateinit var city: String

    city = "ironForge"
    city.uppercase()
    println(city)
}