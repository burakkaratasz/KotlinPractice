package com.example.kotlinpractice.collections

fun main() {

    //tanımlama
    val numbers = ArrayList<Int>()
    val fruits = ArrayList<String>()

    //veri ekleme
    fruits.add("apple")
    fruits.add("watermelon")
    fruits.add("orange")
    println(fruits)

    //güncelleme
    fruits[1] = "banana"
    println(fruits)

    //Insert
    fruits.add(1, "strawberry")
    println(fruits)

    //okuma işlemi
    println(fruits[3])
    println(fruits.get(1))

    for ((index, fruit) in fruits.withIndex()) { //in swift: enumareted()
        println("$index. -> $fruit")
    }
}