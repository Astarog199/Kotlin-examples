package Examples.HelloWorld.Ex03_Functions

//параметры по умолчанию
/**
 * JvmOverloads создаёт дублирующую функцию
 * для каждого варианта
 * 1.вариант: с одним аргументом
 *        fun first(name: String){
 *            first(name, 18)
 *        }
 * 2.вариант: с двумя аргументами
 */
@JvmOverloads
fun first(name: String, age: Int = 18){
    println("name: ${name}\n age: ${age}")
}

