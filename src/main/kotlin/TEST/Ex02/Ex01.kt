import java.io.File
import java.io.IOException


data class User(
    var name: String = "Bob",
    val phone: MutableList <String> = mutableListOf("1234", "2345", "3456"),
    val email: MutableList <String> = mutableListOf("mail@mail.ru", "mail@gmail.com")

){
    fun getPhone() : String{
        var str = "\"phones\": ["

        for (i in phone){
            if (phone.indexOf(i) != phone.size-1) {
                str = "$str\"$i\","
            }else{
                str = "$str\"$i\"]"
            }
        }
        return str
    }

    fun getMail(): String{
        var str = "\"emails\": ["

        for (i in email){
            if (email.indexOf(i) != email.size-1){
                str = "$str\"$i\","
            }else{
                str = "$str\"$i\"]"
            }
        }

        return str
    }

    override fun toString(): String {
        return "[{\"name\": \"$name\", ${getMail()},${getPhone()}}]"
    }
}

fun main() {
    val struct = User ()

    val filesDir = "src/main/kotlin/TEST/Ex02/"

    try {
        File(filesDir, "db.json").writeText(struct.toString())
    } catch (e: IOException) {
        e.printStackTrace()
    }
    println(struct)
}


