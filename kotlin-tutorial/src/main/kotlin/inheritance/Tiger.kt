package inheritance

open class Tiger(val origin: String) {
    // open fun이 아니므로 자식 객체가 override 할 수 없음.
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

fun main(args: Array<String>) {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}