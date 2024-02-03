package Examples.Functions.FunctionsInScope

fun extractEmailUser(s: String?): String{
    return s?.let { s.substringBefore('@')}.orEmpty()
}

fun main() {
    println(extractEmailUser("mail@email.com"))
}