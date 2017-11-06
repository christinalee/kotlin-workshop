package intermediate._11StdLib

import org.junit.jupiter.api.*
import kotlin.test.*

class _7Sum {
    @Test fun testGetTotalOrderPrice() {
        assertEquals(148.0, customers[nathan]!!.getTotalOrderPrice())
    }

    @Test fun testTotalPriceForRepeatedProducts() {
        assertEquals(586.0, customers[lucas]!!.getTotalOrderPrice())
    }
}
