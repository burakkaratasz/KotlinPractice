package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var str1: String? = null
    lateinit var str2: String //daha sonra initialize edilecek. val ile kullanılmaz. primitive data typelarda kullanılmaz
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "merhaba"
    }
}