package functions

/**
 * Default Parameter Values and Named Arguments
 * 기본 파라미터 값과 이름 지정 인자
 * 대부분의 스크립트 언어에서 지원 되나, 자바의 경우에는 지원되지 않음
 * 그래서 항상 기본 값을 생성자에서 생성하거나 class field에 지정하였음.
 * 하지만 kotlin에서는 함수형 프로그래밍으로써, 함수에 기본값 지정과 named arguments는 필수라고 볼 수 있다.
 */

/**
 * 메시지 출력
 */
fun printMessage(message: String) {
    println(message)
}

/**
 * prefix와 메시지 출력
 */
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

/**
 * sum 함수
 */
fun sum(x: Int, y: Int): Int {
    return x + y
}

/**
 * multiply 함수
 */
fun multiply(x: Int, y: Int) = x * y

fun main(args: Array<String>) {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    printMessage("${multiply(5, 4)})")
}