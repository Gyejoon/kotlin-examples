package nullsafety

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
fun main(args: Array<String>) {
    // 코틀린에서는 기본적으로 non-nullable 하다.
    var a: String = "abc"
    // a = null 컴파일 에러

    // 만약 nullable하게 하고싶다면 아래와 같이 type에 ?를 붙인다.
    var b: String? = "abc"
    b = null // ok
    print(b)

    // 아래 코드는 문제가 없다.
    val al = a.length

    // 아래의 코드는 b가 nullable하므로 컴파일에러이다.
//    val bl = b.length
}