package org.example


fun nonLambdaAdd(a: Int, b: Int): Int {
    return a + b
}

val lambdaAdd: (a: Int, b: Int) -> Int =
    { a, b -> a + b }

fun main() {
    val a = 10
    val b = 5

    println(nonLambdaAdd(10, 5)) // 15
    println(lambdaAdd(10, 5)) // 15
}