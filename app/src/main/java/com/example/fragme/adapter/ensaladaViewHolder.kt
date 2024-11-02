package com.example.fragme.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragme.Peliculas
import com.example.fragme.R
import com.example.fragme.ensalada

class ensaladaViewHolder (view : View, private val onClick : (ensalada) -> Unit) : RecyclerView.ViewHolder(view){
    val nombreTextView : TextView =  view.findViewById(R.id.tvNombre)
    val fotoImageView : ImageView = view.findViewById(R.id.ivfoto)
    val desTextView : TextView = view.findViewById(R.id.tvDescripcion)
    val preTextView : TextView = view.findViewById(R.id.tvPrecio)



    fun bind(ensalada : ensalada){
        nombreTextView.text = ensalada.nom
        fotoImageView.setImageResource(ensalada.fo)
        desTextView.text = ensalada.publi
        preTextView.text = ensalada.prace

        itemView.setOnClickListener {
            onClick(ensalada)
        }
    }
}