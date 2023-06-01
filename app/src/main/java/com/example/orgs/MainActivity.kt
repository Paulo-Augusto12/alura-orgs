package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<TextView>(R.id.nome)
        val description = findViewById<TextView>(R.id.description)
        val values = findViewById<TextView>(R.id.valor)

        nome.text = "Cesta de frutas da Alura"
        description.text = "Maçã, Banana, Laranja, Uva e Morango"
        values.text = "45.80"
    }
}