package com.example.orgs.dao

import com.example.orgs.model.Produto
import java.math.BigDecimal

class ProdutosDao {

    fun adicionar(produto: Produto) {
        Companion.produtos.add(produto)
    }

    fun buscarProdutos(): List<Produto> {
        return Companion.produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>(
            Produto(
                nome = "Salada de frutas",
                descricao = "Banana, maçã, laranja",
                valor = BigDecimal("15.45")
            )
        )
    }

}