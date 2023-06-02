package com.example.orgs.ui.activity


import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            produtos = listOf(
                Produto(
                    nome = "Teste",
                    descricao = "Teste legal",
                    valor = BigDecimal(10)
                ),
                Produto(
                    nome = "Teste 1",
                    descricao = "Teste não tão legal",
                    valor = BigDecimal(30)
                )

            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}