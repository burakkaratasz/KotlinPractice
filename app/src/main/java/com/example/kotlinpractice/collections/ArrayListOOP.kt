package com.example.kotlinpractice.collections

fun main() {
    val student1 = Students(38, "Şeyma", "11A")
    val student2 = Students(11, "Burak", "11A")
    val student3 = Students(31, "Deneme", "1A")

    val studentList = ArrayList<Students>()

    studentList.add(student1)
    studentList.add(student2)
    studentList.add(student3)

    for (o in studentList) {
        println("No: ${o.StudentNo} - Name: ${o.StudentName} - Class: ${o.StudentClass}")
    }

    //Sort - Sıralama
    println("Sayısal: Küçükten > Büyüğe")
    val sorting1 = studentList.sortedWith(compareBy { it.StudentNo }) //ASC
    for (o in sorting1) {
        println("No: ${o.StudentNo} - Name: ${o.StudentName} - Class: ${o.StudentClass}")
    }

    println("Sayısal: Büyükten > Küçüğe")
    val sorting2 = studentList.sortedWith(compareByDescending { it.StudentNo }) //DESC
    for (o in sorting2) {
        println("No: ${o.StudentNo} - Name: ${o.StudentName} - Class: ${o.StudentClass}")
    }

    println("Metinsel: Küçükten > Büyüğe")
    val sorting3 = studentList.sortedWith(compareBy { it.StudentName }) //ASC
    for (o in sorting3) {
        println("No: ${o.StudentNo} - Name: ${o.StudentName} - Class: ${o.StudentClass}")
    }


    //Filtreleme
    println("Filtreleme-1")
    val filtering1 = studentList.filter { it.StudentNo > 31 }
    for (o in filtering1) {
        println("No: ${o.StudentNo} - Name: ${o.StudentName} - Class: ${o.StudentClass}")
    }

    println("Filtreleme-2")
    val filtering2 = studentList.filter { it.StudentName.contains("a") }
    for (o in filtering2) {
        println("No: ${o.StudentNo} - Name: ${o.StudentName} - Class: ${o.StudentClass}")
    }

}