package Examples.Throw

/**
 * Функция вернёт значение 4, поскольку блок finally
 * выполнится после блока try, но до возврата из функция
 * returnFromFinally
 */
fun returnFromFinally(): Int {
    try {
        return 7
    } finally {
        return 4
    }
}