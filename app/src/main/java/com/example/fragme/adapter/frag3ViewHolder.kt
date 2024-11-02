package com.example.fragme.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragme.Peliculas
import com.example.fragme.R
import com.example.fragme.ensalada
import com.example.fragme.frag3

class frag3ViewHolder (view : View, private val onClick : (frag3) -> Unit) : RecyclerView.ViewHolder(view){
    val nombreTextView : TextView =  view.findViewById(R.id.tvNombre)
    val fotoImageView : ImageView = view.findViewById(R.id.ivfoto)
    val desTextView : TextView = view.findViewById(R.id.tvDescripcion)
    val preTextView : TextView = view.findViewById(R.id.tvPrecio)



    fun bind(frag3: frag3){
        nombreTextView.text = frag3.nom
        fotoImageView.setImageResource(frag3.fo)
        desTextView.text = frag3.publi
        preTextView.text = frag3.prace

        itemView.setOnClickListener {
            onClick(frag3)
        }
    }
}