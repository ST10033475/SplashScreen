package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home_afrikaans : AppCompatActivity() {
    private lateinit var sconeButton : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_afrikaans)
        sconeButton = findViewById(R.id.button)
        sconeButton.setOnClickListener{
            var sconeIntent  = Intent(this, MainActivity:: class.java)
            startActivity(sconeIntent)
    }
}}