package org.example

class PrintLogger {
    fun log(message: String) {
        println("Logging message: $message")
    }
}

fun main() {
    val logger: PrintLogger by lazy { PrintLogger() }

    val logMessage = "raised error!"
    logger.log(logMessage) // Logging message: raised error!
}

