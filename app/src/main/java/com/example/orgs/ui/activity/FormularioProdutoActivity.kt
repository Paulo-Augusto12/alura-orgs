package com.example.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.orgs.R
import com.example.orgs.dao.ProdutosDao
import com.example.orgs.databinding.ActivityFormularioProdutoBinding
import com.example.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityFormularioProdutoBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configuraBotaoSalvar()
    }

    private fun configuraBotaoSalvar() {
        val saveButton = binding.saveButton

        saveButton.setOnClickListener {
            createProduct()
            Toast.makeText(this, "Produto cadastrado", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    private fun createProduct() {
        val campoNome = binding.nome

        val campoDescricao = binding.descricao

        val campoValor = binding.valor

        val nome = campoNome.text.toString()

        val descricao = campoDescricao.text.toString()

        val valorEmTexto = campoValor.text.toString()

        val valor = if (valorEmTexto.isBlank()) {
            BigDecimal.ZERO
        } else {
            BigDecimal(valorEmTexto)
        }

        val produtoNovo = Produto(nome = nome, descricao = descricao, valor = valor)

        val dao = ProdutosDao()

        dao.adicionar(produtoNovo)
    }
}