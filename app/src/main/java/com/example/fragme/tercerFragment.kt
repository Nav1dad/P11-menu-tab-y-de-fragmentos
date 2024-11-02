package com.example.fragme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragme.adapter.frag3Adapter

class tercerFragment : Fragment() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tercer, container, false)

        recyclerView = view.findViewById(R.id.rvLista3)
        recyclerView.layoutManager = GridLayoutManager(context, 1)

        // Pasamos el listener del adaptador
        recyclerView.adapter = frag3Adapter(frag3Provider.fra3List) { frag3 ->
            // cargamos el fragmento de result
            val detallesFragment = resultFragment.newInstance(frag3.nom, frag3.fo, frag3.publi)
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameContainer, detallesFragment)
                .addToBackStack(null)
                .commit()
        }
        return view
    }
}
