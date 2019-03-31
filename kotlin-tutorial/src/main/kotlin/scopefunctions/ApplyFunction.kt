package scopefunctions

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main(args: Array<String>) {
    val jake = Person()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android Developer"
    }.toString()
    println(stringDescription)
}