package classes

// 데이터를 저장하는 클래스
// 이 클래스는 객체가 String형태로 표현되며, 객체의 값(데이터)이 동일하면 동일한 것으로 간주한다.
data class User(val name: String, val id: Int)

fun main(args: Array<String>) {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 2))

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

}