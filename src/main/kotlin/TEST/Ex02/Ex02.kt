package TEST.Ex02

data class User(
    val name: String = "Bob",
    val phone: MutableList <String> = mutableListOf("1234", "2345", "3456"),
    val email: MutableList <String> = mutableListOf("mail@mail.ru", "mail@gmail.com")
)





fun main() {
    val user = User()


    val json = "name: ${User().name}"

}