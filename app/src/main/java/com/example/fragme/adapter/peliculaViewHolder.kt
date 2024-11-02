package com.example.fragme.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragme.Peliculas
import com.example.fragme.R

class peliculaViewHolder (view : View, private val onClick : (Peliculas) -> Unit) : RecyclerView.ViewHolder(view){
    val nombreTextView : TextView =  view.findViewById(R.id.tvNombre)
    val fotoImageView : ImageView = view.findViewById(R.id.ivfoto)
    val desTextView : TextView = view.findViewById(R.id.tvDescripcion)
    val preTextView : TextView = view.findViewById(R.id.tvPrecio)

    fun bind(pelicula : Peliculas){
        nombreTextView.text = pelicula.nombre
        fotoImageView.setImageResource(pelicula.foto)
        desTextView.text = pelicula.publisher
        preTextView.text = pelicula.precio

        itemView.setOnClickListener {
            onClick(pelicula)
        }
    }
}