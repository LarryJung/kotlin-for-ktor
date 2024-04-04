package org.example

data class Configuration(
    var host: String = "",
    var port: Int = 0
)

fun configure(block: Configuration.() -> Unit): Configuration {
    return Configuration().apply(block)

//    아래 동일
//    val conf = Configuration()
//    conf.block()
//    return conf

//    아래 동일
//    val conf = Configuration()
//    block(conf)
//    return conf

//    아래 동일
//    val conf = Configuration()
//    block.invoke(conf)
//    return conf
}

fun main() {
    val config = configure {
        host = "localhost"
        port = 8080
    }
    println(config) // Configuration(host=localhost, port=8080)
}