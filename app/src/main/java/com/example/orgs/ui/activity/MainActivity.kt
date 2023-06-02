package com.example.orgs.ui.activity


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val floatingButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        floatingButton.setOnClickListener {

            val intent = Intent(this, FormularioProdutoActivity::class.java)

            startActivity(intent)
        }

        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            produtos = listOf(
                Produto(
                    nome = "Teste",
                    descricao = "Teste legal",
                    valor = BigDecimal(10)
                ),
                Produto(
                    nome = "Teste 2",
                    descricao = "Teste legal",
                    valor = BigDecimal(10)
                ),
                Produto(
                    nome = "Teste 3",
                    descricao = "Teste legal",
                    valor = BigDecimal(10)
                ),
                Produto(
                    nome = "Teste 4",
                    descricao = "Teste legal",
                    valor = BigDecimal(10)
                ),

                Produto(
                    nome = "Teste 5",
                    descricao = "Teste não tão legal",
                    valor = BigDecimal(30)
                )

            )
        )
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}