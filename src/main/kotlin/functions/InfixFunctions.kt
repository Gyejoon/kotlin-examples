package functions

/**
 * Infix Functions
 * 하나의 매개변수를 갖는 멤버 함수와 확장은 infix 함수로 변경될 수 있다.
 */

fun main(args: Array<String>) {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    // to라는 infix 함수는 양 끝 매개변수의 ()를 붙인다.
    val pairString = "Ferrari" to "Katrina"
    println(pairString)

    // to infix 함수는 Pair라는 Generic class의 멤버함수 되어있어서 어떠한 타입도 가능하다.
    val pairInteger = 123 to 456
    println(pairInteger)

    // onto는 Pair 객체를 이용하여 구현하였음.
    infix fun String.onto(other: String) = Pair(this, other)

    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    // infix notation은 멤버 함수(메서드)에도 작동을 한다.
    sophia likes claudia
    // likes infix function을 통해 sophia의 likedPeople에 claudia가 속함을 알 수 있다.
    println(sophia.likedPeople.last().name)

}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}
