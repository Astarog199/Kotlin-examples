package CodeWars.lvl8

import TEST.CodeWars.lvl8.checkForFactor
import junit.framework.TestCase.assertEquals
import org.junit.Test

class Test {
    @Test
    fun checkForFactorTest() {
        assertEquals(true, checkForFactor(10, 2))
        assertEquals(true, checkForFactor(63, 7))
        assertEquals(true, checkForFactor(2450, 5))
        assertEquals(true, checkForFactor(24612, 3))
        assertEquals(false, checkForFactor(9, 2))
        assertEquals(false, checkForFactor(653, 7))
        assertEquals(false, checkForFactor(2453, 5))
        assertEquals(false, checkForFactor(24617, 3))
    }
}
