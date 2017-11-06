package intermediate._11StdLib

// Rewrite JavaCode.doSomethingStrangeWithCollection function to Kotlin.
fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy { s -> TODO() }

    return groupsByLength.values.maxBy { group -> TODO() }
}

