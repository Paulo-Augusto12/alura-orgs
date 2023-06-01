package com.example.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.orgs.R
import com.example.orgs.model.Produto

class ListaProdutosAdapter(private val produtos: List<Produto>, private val context: Context) :
    RecyclerView.Adapter<ListaProdutosAdapter.viewHolder>() {

    class viewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            val descricao = itemView.findViewById<TextView>(R.id.description)
            val valor = itemView.findViewById<TextView>(R.id.valor)


            nome.text = produto.nome

            descricao.text = produto.descricao

            valor.text = produto.valor.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val inflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        TODO("Not yet implemented")
        val produto = produtos[position]

        holder.vincula(produto)

    }

}
