package intermediate._3Mutability

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith
import kotlin.test.fail

internal class CollectionMutabilityTest {
    @Test
    fun itemHasBeenAdded() {
        assertFailsWith(UnsupportedOperationException::class) {
            JavaMutations.addToCollection("one")
        }
    }
}