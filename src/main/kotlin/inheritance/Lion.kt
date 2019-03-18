package inheritance

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main(args : Array<String>) {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}