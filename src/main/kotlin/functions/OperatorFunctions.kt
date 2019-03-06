package functions

// (*) 연산자 중복 함수
// 해당 Int값만큼 String의 값이 반복 되는 함수
operator fun Int.times(str: String) = str.repeat(this)

// String의 [] 연산자 중복 함수
// 해당 String[] 을 범위를 지정하여 가져 올 수 있음
// python의 slice기능과 동일하게 만들 수 있다.
operator fun String.get(range: IntRange) = substring(range)

fun main(args: Array<String>) {
    // Bye가 2번 반복
    println(2 * "Bye ")
    val str = "Always forgive your enemies; nothing annoys them so much."
    // str를 0부터 14까지만 가져옴
    println(str[0..14])
    // 사실 위 operator 함수는 아래와 동일한 결과이다.
    // 그리고 String의 [] 연산자를 custom하게 만들어 좀더 간결 하게 만들 수 있는 함수 이다.
    println(str.substring(0..14))
}