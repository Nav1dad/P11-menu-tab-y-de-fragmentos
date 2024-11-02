package com.example.fragme.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragme.Peliculas
import com.example.fragme.R
import com.example.fragme.ensalada
import com.example.fragme.frag3

class frag3Adapter (private val frag3List : List<frag3>, private val onClick : (frag3) -> Unit) : RecyclerView.Adapter<frag3ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): frag3ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pelicula,parent,false)
        return frag3ViewHolder(view,onClick)
    }

    override fun getItemCount(): Int {
        return frag3List.size

    }

    override fun onBindViewHolder(holder: frag3ViewHolder, position: Int) {
        holder.bind(frag3List[position])
    }

}