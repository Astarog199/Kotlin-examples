package Examples.Classes.Ex11_DefaultParameters

data class Person2 (
    val name: String = "",
    val age: Int = 10
    /*
    методы equals, hashCode, toString генерируются автоматически
     */
){
    val phone: String = ""
}