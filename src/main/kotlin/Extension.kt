package org.example

fun String.printHello() {
    println("hello $this")
}

fun List<Int>.removeEven(): List<Int> {
    return this.filter { it % 2 != 0 }
}

fun main() {
    val s = "world"
    s.printHello() // hello world

    val l = listOf(1, 2, 3, 4)
    println(l.removeEven()) // [1, 3]
}

