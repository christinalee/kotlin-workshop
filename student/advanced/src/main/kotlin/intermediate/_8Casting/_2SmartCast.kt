package intermediate._8Casting

open class Animal()
class Dog: Animal() {
    fun bark() { }
}
class Cat: Animal() {
    fun purr() { }
}

var animal: Animal = Dog()

fun something() {
    if (animal is Dog) {
        // TODO: make this compile
//        animal.bark()
    }
}