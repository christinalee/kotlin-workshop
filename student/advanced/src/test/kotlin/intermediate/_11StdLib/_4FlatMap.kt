package intermediate._11StdLib


import org.junit.jupiter.api.*
import kotlin.test.*

class _4FlatMap {
    @Test fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}
