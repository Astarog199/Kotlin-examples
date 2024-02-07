package Examples.FileReader

import java.io.File
import java.io.IOException


fun main() {
    val text = "Этот текст будет записан в файл"
    val filesDir = "src/main/kotlin/Examples/FileReader/"

    try {
        File(filesDir, "notes.txt").writeText(text)
    } catch (e: IOException) {
        e.printStackTrace()
    }
    println(File(filesDir, "notes.txt").readText())

}



