package Examples.Throw

import java.io.File
import java.io.FileReader

class MyException : RuntimeException{
    constructor(message: String): super(message)
    constructor(message: String, cause: Throwable) : super(message, cause)
}

val text = "Этот новый текст будет записан в файл"
val filesDir = "src/main/kotlin/Examples/FileReader/"

fun main() {
    try {
        File(filesDir, "notes.txt").writeText(text)
    }catch (e: Exception) {
        val myExcep = MyException("Unable to write file", e)
        File(filesDir, "ThrowLog.txt").writeText(myExcep.toString())
    }finally {
        println(File(filesDir, "notes.txt").readText())
    }
}