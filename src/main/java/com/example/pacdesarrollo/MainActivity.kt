package com.example.pacdesarrollo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var activitydos = findViewById<Button>(R.id.Activity2)

        activitydos.setOnClickListener {
            val siguienteactividad2 = Intent(this, MainActivity2::class.java)
            startActivity(siguienteactividad2)

        }

        var activitytres= findViewById<Button>(R.id.Activity3)

        activitytres.setOnClickListener {
            var siguienteactividad3 = Intent(this, MainActivity3::class.java)
            startActivity(siguienteactividad3)

        }


    }
}
