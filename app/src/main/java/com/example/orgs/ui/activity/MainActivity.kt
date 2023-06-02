package com.example.orgs.ui.activity


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.dao.ProdutosDao
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()

        val dao = ProdutosDao()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val floatingButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)


        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            produtos = dao.buscarProdutos()
        )

        Log.i("PRODUTO MAIN", "onResume:${dao.buscarProdutos()} ")

        recyclerView.layoutManager = LinearLayoutManager(this)

        floatingButton.setOnClickListener {

            val intent = Intent(this, FormularioProdutoActivity::class.java)

            startActivity(intent)
        }
    }
}