package nullsafety

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
fun main(args: Array<String>) {

    // nullable타입에 대한 널체크 좋지 않은 예시.
    val b: String? = "Kotlin"
    if (b != null && b.length > 0) {
        println("String of length ${b.length}")
    } else {
        println("Empty string")
    }

    // 좋은 예시.
    val k = "Kotlin"
    val j: String? = null
    // 아래 같은 경우 non-nullable 타입이므로 IDE에서 ?를 붙일 필요가 없다고
    // 표시 해준다.
    println(k?.length)
    println(j?.length)


    // 반복문에서 null값 무시하는 방법
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let {
            println(it) // null이 무시된 값만 출력된다.
        }
    }
}