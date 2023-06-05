package com.example.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.databinding.ProdutoItemBinding
import com.example.orgs.R
import com.example.orgs.model.Produto
import java.text.NumberFormat
import java.util.Locale

class ListaProdutosAdapter(
    produtos: List<Produto>,
    private val context: Context
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    private val produtos = produtos.toMutableList()

    class ViewHolder(private val binding: ProdutoItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun vincula(produto: Produto) {
            val nome = binding.nome
            val descricao = binding.description
            val valor = binding.valor
            val currency: NumberFormat = NumberFormat.getCurrencyInstance(Locale("pt", "br"))


            nome.text = produto.nome

            descricao.text = produto.descricao

            valor.text = currency.format(produto.valor)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)

        val binding = ProdutoItemBinding.inflate(inflater, parent, false)

        return ViewHolder(binding)

    }

    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val produto = produtos[position]

        holder.vincula(produto)

    }

    fun atualiza(produtos: List<Produto>) {
        this.produtos.clear()

        this.produtos.addAll(produtos)

        notifyDataSetChanged()
    }

}
