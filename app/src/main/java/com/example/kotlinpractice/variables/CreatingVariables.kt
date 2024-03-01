package com.example.kotlinpractice.variables

fun main() {

    var studentName = "burak"
    var studentAge = 24
    var studentHeight = 1.86
    var studentFirstChar = 'b'
    var isStudentContinue = true


    var product_id: Int = 3416
    var product_name: String = "Macbook Pro"
    var product_price: Double = 42.999
    var product_sup: String = "Apple"

    println("ürün id: $product_id")
    println("ürün adı: $product_name")
    println("ürün fiyatı: $product_price")
    println("ürün tedarikçisi: $product_sup")

    var a = 10
    var b = 20

    println("$a x $b = ${ a*b }")

    //Constants
    //val(kotlin) - let(swift) - final(java)

    var num = 31
    println(num)
    num = 32
    println(num)

    val num2 = 31
    println(num2)
    //num2 = 32


    //Type Casting
    val i = 42
    val d = 31.31

    //sayısaldan sayısala
    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    //sayısaldan metine
    val sonuc3 = i.toString() //"42"

    //metinden sayısala
    val string = "65.56t"
    val sonuc4 = string.toDoubleOrNull()

    if(sonuc4 != null){
        println(sonuc4)
    }
    else{
        println("dönüşüm hatası")
    }

    sonuc4?.let{
        println(it)
    }
}