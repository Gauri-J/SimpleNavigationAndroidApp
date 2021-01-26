package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var etMsg : EditText
    lateinit var tvDisplay : TextView
    lateinit var btnSubmit :Button
    lateinit var btnNext :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etMsg = findViewById(R.id.etMsg)
        btnSubmit = findViewById(R.id.btnSubmit)
        tvDisplay = findViewById(R.id.tvDisplay)
        btnNext = findViewById(R.id.btnNext)

        btnSubmit.setOnClickListener{
            var msg = etMsg.text
            tvDisplay.text = "Hello $msg"
        }

        btnNext.setOnClickListener{
            val name = etMsg.text.toString()
            val intent = Intent(this, SecondActivity :: class.java)

            intent.putExtra("name", name) //intent transfers data as key-value pair
            startActivity(intent)
        }


    }


}

