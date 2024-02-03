package Examples.Collection.List


fun main() {
    val list = listOf(4, 6, 2, 5, 6)
    val elementAt2 = list[2] //2

    for (i in list.indices){
        println("index = $i, element=${list.get(i)}")
    }
//    index = 0, element=4
//    index = 1, element=6
//    index = 2, element=2
//    index = 3, element=5
//    index = 4, element=6

    // вызов элемента по индексу
    val indexOf6 = list.indexOf(6) //1
    // возвращает индекс последнего элемента равного 6
    val lastIndexOf6 = list.lastIndexOf(6) //4
    // размер списка
    val size = list.size //5


}

