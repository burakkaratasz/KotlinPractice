package com.example.kotlinpractice.object_oriented_programming

fun main() {
    val mil = kmToMil(15)
    println(mil)

    areaOfRect(3,5)

    val num1 = 3
    println("$num1'in faktoriyeli: ${num1.factorial()}")

    val string = "börek"
    println("$string içerisindeki e sayısı ${string.howMuchE()}")

    parkingPrice(3)

}

fun kmToMil(km: Int): Double {
    val result = km.toDouble() * 0.621
    return result
}

fun areaOfRect(a: Int, b: Int) {
    val result = "rectangle area is: ${a*b}"
    println(result)
}

fun Int.factorial(): Int {
    var result = 1
    for (i in 1..this) {
        result *= i
    }
    return result
}

fun String.howMuchE(): Int {
    var count = 0
    for (i in this){
        if (i == 'e'){
            count++
        }
    }
    return count
}

fun angleOfNum(angleNum: Int) {
    var result = "the result is: ${((angleNum - 2) * 180) / 2}"
    println(result)
}

fun calSalary(day: Int): Int {
    var salary = 0
    var shift = 0
    if (day <= 18) {
        salary = (8 * 40) * day
    }
    else if (day > 18) {
        shift = day - 18
        salary = ((8 * 40) * 18) + ((80 * 8) * shift)
    }
    return salary
}

fun parkingPrice(hourse: Int) {
    var result = 0
    if (hourse == 1) {
        result = 50
        println("borcunuz: $result")
    }
    else {
        result = hourse - 1
        result = (result * 10) + 50
        println("borcunuz: $result")
    }
}




