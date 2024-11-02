package com.example.fragme.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragme.Peliculas
import com.example.fragme.R
import com.example.fragme.ensalada

class ensaladaAdapter (private val ensaladaList : List<ensalada>, private val onClick : (ensalada) -> Unit) : RecyclerView.Adapter<ensaladaViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ensaladaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_pelicula,parent,false)
        return ensaladaViewHolder(view,onClick)
    }

    override fun getItemCount(): Int {
        return ensaladaList.size

    }

    override fun onBindViewHolder(holder: ensaladaViewHolder, position: Int) {
        holder.bind(ensaladaList[position])
    }

}