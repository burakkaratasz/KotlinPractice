package com.example.kotlinpractice.object_oriented_programming

fun main() {
    val result = 5.myCross(3)
    println(result)
}

fun Int.myCross(num1: Int) : Int {
    return this * num1
}
