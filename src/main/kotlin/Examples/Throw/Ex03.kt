package Examples.Throw

import java.io.File
import java.io.FileReader

val filesDir = "ssrc/main/kotlin/Examples/FileReader/"

val fileReader = FileReader("src/main/kotlin/Examples/FileReader/notes.txt")


fun main() {
    try {
        File(filesDir, "notes.txt").readText()
    } catch (e: Exception) {
    processException(e)
    }finally {
        fileReader.close()
    }
}
fun processException(e: Exception) {
throw IllegalArgumentException()
}


