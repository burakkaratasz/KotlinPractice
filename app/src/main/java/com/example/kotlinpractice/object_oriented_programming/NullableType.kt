package com.example.kotlinpractice.object_oriented_programming

fun main() {
    //Nullable -  Null safety - Optional(Swift)

    //tanımlama
    var str:String? = null

    //yöntem 1
    println("Yöntem 1: ${str?.trim()}") //null olabilir bu şekilde kullanabilirsin

    //yöntem 2
    println("Yöntem 2: ${str!!.trim()}") //kesinlikle null olmayacak ona göre çalıştır. null olursa çöker.

    //yöntem 3 (null check)
    if (str != null) {
        println("Yöntem 3: ${str.trim()}")
    }
    else {
        println("Sonuç null'dur")
    }

    //yöntem 4 (else olmayan if gibi çalışır)
    str?.let {
        println("Yöntem 4: ${it.trim()}")
    }
}