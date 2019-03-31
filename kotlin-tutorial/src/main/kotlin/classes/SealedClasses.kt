package classes

// 자바의 final class와 동일함.
// 상속을 제한하는 키워드.

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main(args: Array<String>) {
    println(greetMammal(Cat("Snowy")))
}