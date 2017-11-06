package intermediate._11StdLib

import org.junit.jupiter.api.*
import kotlin.test.*

class _1Introduction {
    @Test fun testSetOfCustomers() {
        assertEquals(customers.values.toSet(), shop.getSetOfCustomers())
    }
}
