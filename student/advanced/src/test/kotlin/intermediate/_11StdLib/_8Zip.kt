package intermediate._11StdLib

import org.junit.jupiter.api.*
import kotlin.test.*

class _8Zip {
    @Test
    fun testZipNameAndCustomer() {
        assertEquals(customers.toList(), shop.zipNameAndCustomer())
    }
}