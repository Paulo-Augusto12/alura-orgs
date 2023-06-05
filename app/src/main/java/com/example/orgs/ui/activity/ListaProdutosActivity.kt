package com.example.orgs.ui.activity


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.dao.ProdutosDao
import com.example.orgs.databinding.ActivityListaProdutosBinding
import com.example.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaProdutosActivity : AppCompatActivity() {

    private val dao = ProdutosDao()
    private val adapter = ListaProdutosAdapter(
        context = this,
        produtos = dao.buscarProdutos()
    )

    private val binding by lazy {
        ActivityListaProdutosBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuraRecyclerView()
        configuraFloatingActionButton()
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        adapter.atualiza(dao.buscarProdutos())
    }

    private fun configuraFloatingActionButton() {
        val floatingButton = binding.floatingActionButton

        floatingButton.setOnClickListener {
            navigateToProductForm()
        }
    }

    private fun navigateToProductForm() {
        val intent = Intent(this, FormularioProdutoActivity::class.java)

        startActivity(intent)
    }

    private fun configuraRecyclerView() {
        val recyclerView = binding.recyclerView
        recyclerView.adapter = adapter

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}