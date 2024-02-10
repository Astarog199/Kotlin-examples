package Examples.Throw

import java.io.File
import java.io.FileReader

val file = File("src/main/kotlin/Examples/FileReader/notes.txt")

/**
 * Этот код открывает файл и выводит его содержимое на консоль.
 *
 * Метод 'use' используется для автоматического закрытия ресурса
 * (в данном случае файла) после выполнения блока кода.
 * Это помогает избежать утечек ресурсов и повышает надежность кода.
 */
fun main() {
    FileReader(file).use {
        println(it.readText())
    }
}