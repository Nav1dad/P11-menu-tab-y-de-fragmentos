package com.example.fragme

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class resultFragment : Fragment() {

    private lateinit var namePelicula : TextView
    private lateinit var ivFotito : ImageView
    private lateinit var ivPubli : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_result, container, false)
        namePelicula = view.findViewById(R.id.tvNombre)
        ivFotito = view.findViewById(R.id.imvFoto)
        ivPubli = view.findViewById(R.id.tvReal)

        val nombrePelicula = arguments?.getString("nombre_pelicula")
        val ImagenPizza = arguments?.getInt("imagen_pizza")
        val PubliPizaa = arguments?.getString("descripi")

        namePelicula.text = nombrePelicula
        ImagenPizza?.let {
            ivFotito.setImageResource(it)
        }
        ivPubli.text = PubliPizaa

        return view
    }

    companion object{
        fun newInstance(nombrePelicula : String, ImagenPizza: Int, PubliPizaa : String) : resultFragment{
            val fragment = resultFragment()
            val args = Bundle()
            args.putString("nombre_pelicula" , nombrePelicula)
            args.putInt("imagen_pizza", ImagenPizza)
            args.putString("descripi", PubliPizaa)
            fragment.arguments = args
            return fragment
        }
    }
}