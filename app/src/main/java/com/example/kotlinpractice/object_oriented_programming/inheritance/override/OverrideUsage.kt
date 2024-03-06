package com.example.kotlinpractice.object_oriented_programming.inheritance.override

fun main() {
    val animal = Animal()
    val mammal = Mammal()
    val dog = Dog()
    val cat = Cat()

    animal.voice()
    mammal.voice()
    dog.voice()
    cat.voice()
}