package intermediate._11StdLib

import org.junit.jupiter.api.*
import kotlin.test.*

class _10GroupBy {
    @Test fun testGroupCustomersByCity() {
        assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}
