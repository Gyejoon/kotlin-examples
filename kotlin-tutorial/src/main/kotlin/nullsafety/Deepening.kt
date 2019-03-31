package nullsafety

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
fun main(args: Array<String>) {
    // The !! Operator
    // 우선 !! Operator의 용도는 2가지이다.
    // 1. Nullable Type을 참조할 경우 NPE를 throws 하기 위한 용도.
    // 2. Nullable Type을 Non Nullable Type으로 변환하기 위한 용도.
    val b: String? = "Test"
    val l = b!!.length
    println(l)

    // Safe Casts
    // Class Cast Exception 방지
    // val aInt: Int? = a as? Int

    // Collections of Nullable Type
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    println(intList)
}