package com.example.kotlinpractice.object_oriented_programming

fun main() {

    //nesne oluşturma
    val mercedes = Car("red", 200, true)
    val skoda = Car("gray", 115, false)

    //okuma
    println("Renk                : ${mercedes.color}")
    println("Güç                 : ${mercedes.hoursePower}")
    println("Çalışıyor mu?       : ${mercedes.isStart}")

    skoda.carInfo()

    //yazma
    skoda.hoursePower = 145

    mercedes.stopCar()


}