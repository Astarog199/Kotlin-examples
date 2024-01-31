package Examples.Classes.Ex10_copy

data class Person (
    val name: String,
    val age: Int,
    val phone: String
    /*
    методы equals, hashCode, toString генерируются автоматически
     */
)
{
    override fun toString(): String {
        return "name: $name\nage: $age\nphone: $phone"
    }
}