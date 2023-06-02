package com.example.orgs.dao

import com.example.orgs.model.Produto

class ProdutosDao {

    private val produtos = mutableListOf<Produto>()

    fun adicionar(produto: Produto) {
        produtos.add(produto)
    }

    fun buscarProdutos(): List<Produto> {
        return produtos.toList()
    }

}