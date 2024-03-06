package com.example.kotlinpractice.object_oriented_programming.inheritance

fun main() {
    val topkapiPalace = Palace(5,100)
    val bosphorusVilla = Villa(true, 10)

    println(topkapiPalace.towerNum)
    println(topkapiPalace.windowNum)
    println(bosphorusVilla.isGarage)
    println(bosphorusVilla.windowNum)

}