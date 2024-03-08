package com.example.kotlinpractice.object_oriented_programming.interface_usage

class AClass: MyInterface {
    override val x: Int = 11

    override fun method1() {
        println("metod 1 çalıştı")
    }

    override fun method2(): String {
        return "metod 2 çalıştı"
    }
}