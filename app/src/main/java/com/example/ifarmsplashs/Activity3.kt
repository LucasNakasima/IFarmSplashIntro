package com.example.ifarmsplashs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_3.*
import kotlinx.android.synthetic.main.activity_main.*

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val bundle: Bundle? = intent.extras

        val id = bundle?.get("id")
        val nome = bundle?.get("nome")

        Toast.makeText(applicationContext, "ID: " + id.toString() + " NOME:" + nome,
            Toast.LENGTH_LONG).show()

        buttonVoltar.setOnClickListener() {
            intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

    }

}