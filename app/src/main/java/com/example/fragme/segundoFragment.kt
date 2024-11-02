package com.example.fragme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragme.adapter.ensaladaAdapter
import com.example.fragme.adapter.peliculasAdapter

class segundoFragment : Fragment() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_segundo, container, false)

        recyclerView = view.findViewById(R.id.rvLista2)
        recyclerView.layoutManager = GridLayoutManager(context,1)

        //Pasamos el listener del adaptador
        recyclerView.adapter = ensaladaAdapter(ensaladaProvider.ensaladaList){ensalda ->
            // cargamos el fragmento de result
            val detallesFragment = resultFragment.newInstance(ensalda.nom, ensalda.fo, ensalda.publi)
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameContainer,detallesFragment)
                .addToBackStack(null)
                .commit()

        }
        return view
    }

}