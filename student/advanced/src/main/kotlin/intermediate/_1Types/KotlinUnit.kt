@file:JvmName("KotlinUnit")

package intermediate._1Types

class WrappedResult<T>(val myResult: T)

fun one() { }
fun two(): Int = 2
fun three(): String = "3"

fun getWrappedResult(): WrappedResult<*> {
    val randomInt = (Math.random() * 3).toInt()

    return when (randomInt) {
        1 -> WrappedResult(one())
        2 -> WrappedResult(two())
        else -> { WrappedResult(three()) }
    }
}
