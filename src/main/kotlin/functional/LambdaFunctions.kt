package functional

val upperCase1: (String) -> String = { str: String -> str.toUpperCase() }
val upperCase2: (String) -> String = { str -> str.toUpperCase() }
val upperCase3 = { str: String -> str.toUpperCase() }

// 람다와 타입 추론 두가지를 할 수 없음.
//val upperCase4 = { str -> String.toUpperCase() }

// 단일 매개 변수 람다. (명시 적으로 이름 지정 필요없음)
// 암시적 it 변수를 사용함.
// 실제로 제일 많이 사용됨.
val upperCase5: (String) -> String = { it.toUpperCase() }

// 한개의 함수만 호출 시에는 function pointer (::) 를 사용하면 된다.
val upperCase6: (String) -> String = String::toUpperCase

fun main(args: Array<String>) {
    println(upperCase1("test1"))
    println(upperCase2("test2"))
    println(upperCase3("test3"))
    println(upperCase5("test5"))
    println(upperCase5("test6"))
}