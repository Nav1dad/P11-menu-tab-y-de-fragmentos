package com.example.fragme

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class ensaldaFragmentFinal : Fragment() {

    private lateinit var namePelicula : TextView
    private lateinit var ivFotito : ImageView
    private lateinit var ivPubli : TextView
    private lateinit var preci : TextView
    private lateinit var des : TextView
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
        preci = view.findViewById(R.id.tvPublicacion)
        des = view.findViewById(R.id.tvDescri)


        val nombrePelicula = arguments?.getString("nombre_pelicula")
        val ImagenPizza = arguments?.getInt("imagen_pizza")
        val PubliPizaa = arguments?.getString("descripi")
        val prec = arguments?.getString("precio")
        val descripi = arguments?.getString("des")

        namePelicula.text = nombrePelicula
        ImagenPizza?.let {
            ivFotito.setImageResource(it)
        }
        ivPubli.text = PubliPizaa
        preci.text = prec
        des.text = descripi

        return view
    }

    companion object{
        fun newInstance(nombrePelicula : String, ImagenPizza: Int, PubliPizaa : String, prec : String, descripi : String) : resultFragment{
            val fragment = resultFragment()
            val args = Bundle()
            args.putString("nombre_pelicula" , nombrePelicula)
            args.putInt("imagen_pizza", ImagenPizza)
            args.putString("descripi", PubliPizaa)
            args.putString("precio", prec)

            fragment.arguments = args
            return fragment
        }
    }
}