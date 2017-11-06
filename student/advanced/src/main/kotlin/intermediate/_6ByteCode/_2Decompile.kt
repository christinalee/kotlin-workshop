package intermediate._6ByteCode

// TODO: What lines do the constructor occupy in the
// decompiled version of this file
class Decompile(yourName: String) {
    val myName
        get() = "Christina"
    val yourName: String

    init {
        this.yourName = yourName
    }

    // TODO: What byte code line is "randAge" being assigned at (i.e. LO, L1, etc)
    fun randomAge(): Int {
        val random = Math.random()
        val randomInRange = random * 114
        val randAge = randomInRange.toInt()

        return randAge
    }
}