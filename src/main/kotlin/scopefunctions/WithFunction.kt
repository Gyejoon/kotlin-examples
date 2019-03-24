package scopefunctions

class Configuration(var host: String, var port: Int)

fun main(args: Array<String>) {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port")
    }

    // with function 을 사용하지 않는다면 아래와 같이 작성해야 한다.
    println("${configuration.host}:${configuration.port}")
}