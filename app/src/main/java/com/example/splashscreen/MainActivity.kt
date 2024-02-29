package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var pizzaButton : Button
    private lateinit var tamelesButton : Button
    private lateinit var boereworsButton : Button
    private lateinit var croissantButton : Button
    private lateinit var weltButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pizzaButton = findViewById(R.id.button)
        pizzaButton.setOnClickListener {
            var pastaIntent = Intent(this, home_italian::class.java)
            startActivity(pastaIntent)
        }

        tamelesButton = findViewById(R.id.button2)
        tamelesButton.setOnClickListener {
            var tamelesIntent = Intent(this, home_spanish::class.java)
            startActivity(tamelesIntent)
        }


        boereworsButton = findViewById(R.id.button3)
        boereworsButton.setOnClickListener {
            var boereworsIntent = Intent(this, home_afrikaans::class.java)
            startActivity(boereworsIntent)
        }

        croissantButton = findViewById(R.id.button4)
        croissantButton.setOnClickListener {
            var croissantIntent = Intent(this, home_french::class.java)
            startActivity(croissantIntent)
        }

        weltButton = findViewById(R.id.button5)
        weltButton.setOnClickListener {
            var weltIntent = Intent(this, home_german::class.java)
            startActivity(weltIntent)
        }
    }
        }


