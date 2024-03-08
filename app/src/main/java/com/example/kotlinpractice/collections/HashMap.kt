package com.example.kotlinpractice.collections

fun main() {

    //Dictionary
    val cities = HashMap<Int, String>()
    cities.put(6,"Ankara")
    cities.put(34, "Istanbul")
    cities[38] = "Kayseri"
    println(cities)
    println(cities.get(6))

    for ((key, value) in cities) {
        println("$key -> $value")
    }
}