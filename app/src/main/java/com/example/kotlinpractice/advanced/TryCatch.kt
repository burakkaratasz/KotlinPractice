package com.example.kotlinpractice.advanced

import java.lang.Exception

fun main() {

    //1.Compile Error (çalıştırmadan önce)
    val x = 10
    //x = 99

    //2.Exception : Runtime Error (çalıştırma sırasında)
    val a = 10
    val b = 0

    try {
        println("sonuç: ${a/b}")
        println("işlem tamam")
    }
    catch (e: Exception) {
        println("ikinci sayı 0 olamaz")
    }
}