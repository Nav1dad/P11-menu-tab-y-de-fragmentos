package com.example.fragme

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navegacion : BottomNavigationView

    private fun loadFragment(fragment: androidx.fragment.app.Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameContainer, fragment)
            addToBackStack("replacement")
            commit()
        }
    }

    private val mOnNavMenu = BottomNavigationView.OnNavigationItemSelectedListener {item->
        when (item.itemId){
            R.id.fragmento1->{
                loadFragment(Fragment_Uno())
                true
            }
            R.id.fragmento2->{
                loadFragment(segundoFragment())
                true
            }
            R.id.fragmento3->{
                loadFragment(tercerFragment())
                true
            }
            R.id.fragmento4->{
                loadFragment(frag4Fragment())
                true
            }
            else -> false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        navegacion = findViewById(R.id.nav_menu)
        navegacion.setOnNavigationItemSelectedListener(mOnNavMenu)

        if (savedInstanceState == null){
            loadFragment(Fragment_Uno())
        }
    }
}