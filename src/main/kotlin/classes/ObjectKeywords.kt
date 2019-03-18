package classes

import java.util.*

// 일반적인 object-oriented 언어의 표현 방법
class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")
}

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

class BigBen {
    // Java의 static 메소드의 비슷함.
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main(args: Array<String>) {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    rentPrice(10, 2, 1)

    DoAuth.takeParams("foo", "qwerty")

    BigBen.getBongs(12)
}