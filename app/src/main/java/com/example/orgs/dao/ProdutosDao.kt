package com.example.orgs.dao

import com.example.orgs.model.Produto

class ProdutosDao {

    fun adicionar(produto: Produto) {
        Companion.produtos.add(produto)
    }

    fun buscarProdutos(): List<Produto> {
        return Companion.produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }

}