import org.junit.Test

import org.junit.Assert.*

class IrregularConjKtTest {

    @Test
    fun irregularConj() {
        assertEquals("yo juego", irregularConj("yo jugar"))
    }
    @Test
    fun irregularConjTener() {
        assertEquals("yo tengo", irregularConj("yo tener"))
    }
}