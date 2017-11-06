package intermediate._2Nullability

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

internal class PlatformTypesTest {

    @Test
    fun failGracefully() {
        assertFailsWith(IllegalStateException::class) {
            PlatformTypes().failGracefully()
        }
    }

}