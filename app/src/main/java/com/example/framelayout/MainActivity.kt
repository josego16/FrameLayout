package com.example.framelayout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnSaltar: Button
    private lateinit var copoNieve: ImageView
    private lateinit var snowboarding: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSaltar = findViewById(R.id.boton_View)
        copoNieve = findViewById(R.id.imagen_copo)
        snowboarding = findViewById(R.id.imagen_snow)

        initEvent()
    }

    private fun initEvent() {
        copoNieve.setOnClickListener {
            val copoIntent = Intent(this, CopoActivity::class.java)
            startActivity(copoIntent)
        }
        snowboarding.setOnClickListener {
            val snowIntent = Intent(this, SnowActivity::class.java)
            startActivity(snowIntent)
        }
    }
}