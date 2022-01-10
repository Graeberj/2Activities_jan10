package com.example.a2activities_jan10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstActivity: AppCompatActivity() {

    private lateinit var mainBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        mainBtn = findViewById(R.id.btnMain)
        mainBtn.text = getText(R.string.first_screen)
        mainBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)
        }

    }
}