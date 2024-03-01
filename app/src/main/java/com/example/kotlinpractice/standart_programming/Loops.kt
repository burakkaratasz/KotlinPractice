package com.example.kotlinpractice.standart_programming

fun main() {

    for (i in 1..3) { //Swift: i in 1...3
        println("Döngü $i: $i")
    }

    for (j in 10..20 step 5) {
        println(j)
    }

    for (a in 20 downTo 5 step 5) {
        println(a)
    }

    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println("döngü 1: $i")
    }
    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println("döngü 2: $i")
    }
}