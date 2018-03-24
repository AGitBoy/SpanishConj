import org.junit.Test

import org.junit.Assert.*

class ConjSelectKtTest {

    @Test
    fun conjSelect() {
        assertEquals("yo bailo", conjSelect("yo bailar"))
        assertEquals("yo tengo", conjSelect("yo tener"))
    }
}