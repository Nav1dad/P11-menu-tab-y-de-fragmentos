package com.example.fragme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragme.adapter.peliculasAdapter

class Fragment_Uno : Fragment() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment__uno, container, false)

        recyclerView = view.findViewById(R.id.rvLista)
        recyclerView.layoutManager = GridLayoutManager(context,1)

        //Pasamos el listener del adaptador
        recyclerView.adapter = peliculasAdapter(peliculasProvider.peliculasList){pelicula ->
            // cargamos el fragmento de result
            val detallesFragment = resultFragment.newInstance(pelicula.nombre, pelicula.foto, pelicula.publisher)
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameContainer,detallesFragment)
                .addToBackStack(null)
                .commit()

        }
        return view
    }

}