package Examples.Throw

import java.io.File
import java.io.FileReader






fun main() {
    /**
     * Метод выводит первые три элемента стека вызовов исключения RuntimeException.
     * Это может быть полезно для отладки, так как позволяет увидеть,
     * в каком месте программы возникло исключение.
     */
    fun processException(e: Exception) {
        RuntimeException().apply {
            for (entry in stackTrace.take(3)){
                println(entry)
            }
        }
    }

    val filesDir = "ssrc/main/kotlin/Examples/FileReader/"
    val fileReader = FileReader("src/main/kotlin/Examples/FileReader/notes.txt")

    try {
        File(filesDir, "notes.txt").readText()
    } catch (e: Exception) {
        processException(e)
    }finally {
        fileReader.close()
    }
}