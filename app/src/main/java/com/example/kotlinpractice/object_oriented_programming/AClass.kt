package com.example.kotlinpractice.object_oriented_programming

class AClass {
    companion object { //statik objeler oluşturmak için
        var y = 6
        fun method2() {
            println("method2 is working")
        }
    }
    var x = 19
    fun method() {
        println("method is working")
    }
}