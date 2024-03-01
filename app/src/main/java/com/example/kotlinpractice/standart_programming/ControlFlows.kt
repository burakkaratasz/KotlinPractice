package com.example.kotlinpractice.standart_programming

fun main() {
    val age = 15
    val name = "ahmet"

    if (age >= 18) { //Swift: if age >= 18 { }
        println("$name is adult")
    }
    else {
        println("$name is not an adult")
    }

    val userName = "admin"
    val password = 123456

    if (userName == "admin" && password == 123456) {
        println("success enter")
    }
    else {
        println("try again")
    }

    //When (switch-case)

    val day = 3

    when(day) {
        1 -> println("pazartesi")
        2-> println("salı")
        3 -> println("çarşamba")
        4 -> println("perşembe")
        5 -> println("cuma")
        6 -> println("cumartesi")
        7 -> println("pazar")
        else -> println("error")
    }
}