package nullsafety

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
fun main(args: Array<String>) {
    val b: String? = null
    // 아래와 같은 코드가 있을 경우
//    val l: Int = if (b != null) b.length else -1

    // Elvis Operator를 이용하면 된다.
    val l = b?.length ?: -1
}