package com.example.kotlinpractice.object_oriented_programming

fun main() {
    val a = AClass()
    println(a.x)
    a.method()

    //Virtual Object - İsimsiz nesne oluşturma
    println(AClass().x)
    AClass().method()
    //2 farklı nesne oluşturmuş olduk

    //static object ile erişim
    println(AClass.y)
    AClass.method2()

}