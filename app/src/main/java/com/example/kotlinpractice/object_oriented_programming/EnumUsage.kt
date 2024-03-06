package com.example.kotlinpractice.object_oriented_programming

fun main() {
    calFee(350, BoxSize.MEDIUM)
}

fun calFee(pcs: Int, size: BoxSize) {
    when(size) {
        BoxSize.SMALL -> println("Toplam Maliyet: ${pcs*30}₺")
        BoxSize.MEDIUM -> println("Toplam Maliyet: ${pcs*40}₺")
        BoxSize.LARGE -> println("Toplam Maliyet: ${pcs*50}₺")
    }
}