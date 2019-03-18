package inheritance

open class Dog {
    open fun sayHello() {
        println("wal wal")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif")
    }
}

fun main(args: Array<String>) {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}