package com.example.kotlinpractice.object_oriented_programming

class Car(var color: String, var hoursePower: Int, var isStart: Boolean) {

    init {
        println("Constructor is working......")
    }

    fun carInfo(){
        println("----------------------")
        println("Color                 : ${this.color}")
        println("Power                 : ${this.hoursePower}")
        println("Is Working            : ${this.isStart}")

    }
    //this. swift: self

    fun startCar() { //side effect
        if (this.isStart == false) {
            println("Car is started...")
        }
        else {
            println("Car is already start")
        }
    }

    fun stopCar() {
        if (this.isStart == true) {
            println("Car is stop.")
        }
        else {
            println("Car is not working.")
        }
    }
}