package Examples.Classes.Ex11_DefaultParameters

fun main() {

    val alice = Person (name = "Alice")
    println(alice) //Person(name=Alice, age=10, phone=)

    val bob = Person2 (name = "Bob")
    println(bob) //Person(name=Alice, age=10, phone=)
    println(bob.equals(alice)) //false
    println(bob.name.equals(alice.name)) // false
    println(bob.age.equals(alice.age)) //true
    println(bob.phone.equals(alice.phone)) //true поля в конструкторе доступно при вызове
}