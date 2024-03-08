package com.example.kotlinpractice.object_oriented_programming.inheritance

fun main() {
    val topkapiPalace = Palace(5,100)
    val bosphorusVilla = Villa(true, 10)

    println(topkapiPalace.towerNum)
    println(topkapiPalace.windowNum)
    println(bosphorusVilla.isGarage)
    println(bosphorusVilla.windowNum)

    if (topkapiPalace is Palace) {
        println("saraydır")
    }
    else {
        println("saray değildir")
    }

    //Upcasting
    val home: Home = bosphorusVilla //villa'yı eve dönüştürme

    //Downcasting
    val home2 = Home(7)
    val palace = home2 as Palace



}