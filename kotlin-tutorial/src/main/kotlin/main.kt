import java.util.*

fun sum(a: Int, b: Int) = a + b

fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }

fun main(args: Array<String>) {
    println("sum of 19 and 23 is ${sum(19, 23)}")

    print(describe(1))

}