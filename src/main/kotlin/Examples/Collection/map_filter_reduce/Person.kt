package Examples.Collection.map_filter_reduce

import kotlin.math.min
import kotlin.random.Random

data class Person(val name: String, val  age: Int)
val visitors = mutableListOf<Person> ()

fun main() {
    for (i in 0..4){
      visitors.add(Person(name = "name$i", age =  Random.nextInt(15, 25)))
        println(visitors[i])
    }

    val minAge = visitors
        .map { it.age }     //получаем поле age класса person
        .filter { it > 18 } //оставляем значения согласно условию
        .reduce { a, b -> min(a, b)  } // среди оставшихся значений поля age получаем минимальное
    println(minAge)

    val uniqueNames = visitors.asSequence()
        .filter { it.age > 18 }
        .map { it.name }
        .toSet()
    println(uniqueNames)
}