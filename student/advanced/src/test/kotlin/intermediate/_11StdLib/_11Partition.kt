package intermediate._11StdLib

import org.junit.jupiter.api.*
import kotlin.test.*

class _11Partition {
    @Test fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        assertEquals(setOf(customers[reka]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}
