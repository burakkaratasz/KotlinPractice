package com.example.kotlinpractice.object_oriented_programming

import java.nio.DoubleBuffer

class Functions {

    //void - geri dönüş değeri olmayan
    fun hello() {
        println("merhaba")
    }

    //return
    fun hello2(): String {
        val result = "merhaba2"
        return result
    }

    //parameter
    fun sayHello(name:String) {
        val result = "merhaba $name"
        println(result)
    }

    fun sumNums(num1:Int, num2:Int) {
        val result = "toplama sonucu = ${num1+num2}"
        println(result)
    }
    //overloading
    fun sumNums(num1: Double, num2: Double) {
        val result = "toplama sonucu = ${num1+num2}"
        println(result)
    }


}