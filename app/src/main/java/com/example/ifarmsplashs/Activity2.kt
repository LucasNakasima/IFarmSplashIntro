package com.example.ifarmsplashs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val bundle: Bundle? = intent.extras

        val id = bundle?.get("id")
        val nome = bundle?.get("nome")

        Toast.makeText(applicationContext, "ID: " + id.toString() + " NOME:" + nome,
            Toast.LENGTH_LONG).show()

        buttonVoltar.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonAvancar.setOnClickListener() {
            intent = Intent(this, Activity3::class.java)
            intent.putExtra("id2", 1)
            intent.putExtra("nome2", "Gabriel")
            startActivity(intent)
        }
    }
}