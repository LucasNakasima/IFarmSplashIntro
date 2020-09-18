package com.example.ifarmsplashs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener() {
            intent = Intent(this, Activity2::class.java)
            intent.putExtra("id", 1)
            intent.putExtra("nome", "Gabriel")
            startActivity(intent)
        }
    }
}