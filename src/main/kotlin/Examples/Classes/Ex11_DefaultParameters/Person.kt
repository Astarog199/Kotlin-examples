package Examples.Classes.Ex11_DefaultParameters

data class Person (
    val name: String = "",
    val age: Int = 10,
    val phone: String = ""
    /*
    методы equals, hashCode, toString генерируются автоматически
     */
)
