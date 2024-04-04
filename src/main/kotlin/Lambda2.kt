package org.example


fun multiple2(block: () -> Int): Int {
    return block() * 2
}

fun main() {
    val will5: () -> Int = { 5 }
    println(
        multiple2(will5)
    ) // 10
    println(
        multiple2 { 50 }
    ) // 100

}