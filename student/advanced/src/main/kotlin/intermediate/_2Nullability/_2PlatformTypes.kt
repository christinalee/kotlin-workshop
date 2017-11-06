package intermediate._2Nullability

class PlatformTypes {
    fun consumeList() {
        val myList = JavaTypes.getAList()

        // TODO: Change the getAList function signature to make this not compile
        myList[0]
    }

    fun failGracefully() {
        // TODO: Modify this function to fail on the patform type instead of with an NPE
        val list = JavaTypes.dangerousList()
        list.size
    }
}