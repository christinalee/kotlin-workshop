package intermediate._11StdLib

import org.junit.jupiter.api.*
import kotlin.test.*

class _6Sort {
    @Test fun testGetCustomersSortedByNumberOfOrders() {
        assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}
