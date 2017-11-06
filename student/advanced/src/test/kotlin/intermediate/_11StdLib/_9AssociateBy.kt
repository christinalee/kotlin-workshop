package intermediate._11StdLib

import org.junit.jupiter.api.*
import kotlin.test.*

class _9AssociateBy {
    @Test
    fun testZipNameAndCustomer() {
        assertEquals(customers, shop.associateCustomersByName())
    }
}