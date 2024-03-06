package com.example.kotlinpractice.object_oriented_programming.package2

import com.example.kotlinpractice.object_oriented_programming.package1.A

class B: A() {
    fun function(){
        //val sample = A() //başka bir paketi import ettik nesne oluşturarak
        println(defaultVal)
        println(publicVal)
        println(internalVal)
        println(protectedVal)
    }
}