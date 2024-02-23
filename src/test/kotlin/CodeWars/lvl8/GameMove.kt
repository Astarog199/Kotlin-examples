package CodeWars.lvl8

import TEST.CodeWars.lvl8.move
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals


class TestKata {
    @Test
    fun basicTests() {
        assertEquals(8, move(0, 4))
        assertEquals(15, move(3, 6))
        assertEquals(12, move(2, 5))
    }
}