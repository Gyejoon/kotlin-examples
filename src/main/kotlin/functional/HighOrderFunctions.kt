package functional

// 고차함수
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main(args: Array<String>) {
    // 함수 인수를 전달.
    // 이름으로 함수를 참조하는 표기법 (::)
    val sumResult = calculate(4, 5, ::sum)

    // 함수 인수로 람다를 전달
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")

    val func = operation()
    println(func(2))
}