package Examples.Classes.Ex10_copy



fun main() {
    val user = Person("user", 24, "+7(999) 999 9999")
    val also = user.copy()
    println(also)
    println("________________")
    val bob = user.copy(name = "Bob", age = 31)
    println(bob)

}