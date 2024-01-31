package Examples.Classes.Ex09_DataClass

class Person
    (
    val name: String,
    val age: Int,
    val phone: String
    )
{
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

    other as Person

        if (name != other.name) return false
        if (age != other.age) return false
        if (phone != other.phone) return false

        return true
    }


    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        result = 31 * result + phone.hashCode()
        return result
    }

    override fun toString(): String {
        return "Person(name=$name, age=$age, phone=$phone"
    }
}

data class PersonData (
    val name: String,
    val age: Int,
    val phone: String
    /*
    методы equals, hashCode, toString генерируются автоматически
     */
)

fun main() {
   val p = Person("user", 24, "+7(999) 999 9999")
    println(p.equals(null)) //false
    println(p.hashCode()) //922087950
    println(p)
    println("_________________________")
    val p2 =PersonData("user", 24, "+7(999) 999 9999")
    println(p2.equals(null)) //false
    println(p2.hashCode()) //922087950
    println(p2)

}