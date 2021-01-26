package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var tvSecondPage : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvSecondPage  = findViewById(R.id.tvSecondPage)

        val name = intent.getStringExtra("name")

        tvSecondPage.text = "Hello $name, Welcome to new page"


    }
}