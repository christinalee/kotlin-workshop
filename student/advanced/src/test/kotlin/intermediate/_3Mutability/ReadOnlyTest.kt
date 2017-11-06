package intermediate._3Mutability

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ReadOnlyTest {
    @Test
    fun addToList() {
        val readOnly = ReadOnly()

        readOnly.addToList()

        assertTrue { readOnly.myReadOnlyList.size > 0 }
    }

}