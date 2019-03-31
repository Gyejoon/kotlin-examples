package functions

/**
 * 가변인자 함수
 *
 * vararg 키워드를 선언한 매개변수는 Array타입이다.
 */
fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) println(prefix + m)
}

fun log(vararg entries: String) {
    // * 연산자는 spread 연산자로도 사용이 가능하다.
    printAll(*entries)
}

fun main(args: Array<String>) {
    printAll("Hello", "Hello", "Salut", "Hola", "你好")
    // vararg parameter and named parameter
    printAllWithPrefix("Hello", "Hello", "Salut", "Hloa", "你好",
            prefix = "Greeting: ")
    log("Hello", "Hello", "Salut", "Hola", "你好")
}