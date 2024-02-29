package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home_spanish : AppCompatActivity() {
    private lateinit var sconeButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_spanish)
        sconeButton = findViewById(R.id.button)
        sconeButton.setOnClickListener{
            var sconeIntent  = Intent(this, MainActivity:: class.java)
            startActivity(sconeIntent)
        }
    }
}