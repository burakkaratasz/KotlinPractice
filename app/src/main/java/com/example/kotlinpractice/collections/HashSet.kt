package com.example.kotlinpractice.collections

fun main() {
    val fruits = HashSet<String>()

    fruits.add("elma")
    fruits.add("armut")
    fruits.add("kivi")
    println(fruits)

    fruits.add("elma") //aynı eleman tekrar kaydolmaz
    println(fruits)
}