package Examples.Decorator

data class User(
    val name: String = "Bob",
    val phone: MutableList <String> = mutableListOf("1234", "2345", "3456"),
    val email: MutableList <String> = mutableListOf("mail@mail.ru", "mail@gmail.com")
)

interface Print {
    fun printName(name: String)
    fun printPhone(array: MutableList<String>)
    fun printEmail(array: MutableList<String>)
}

class PrintContact(user: User) : Print {
    val name =  user.name
    override fun printName(name: String) {
        println("User: $name")
    }

    override fun printPhone(array: MutableList<String>) {
        for (i in array)
        println("Phone: $i")
    }

    override fun printEmail(array: MutableList<String>) {
        for (i in array){
            println("eMail: $i")
        }
    }
}

class Derived (b: Print) : Print by b

fun main() {
    val user = User()
    val b = PrintContact(user)

    Derived(b).printName(user.name)
    Derived(b).printPhone(user.phone)
    Derived(b).printEmail(user.email)
}