package com.example.pratica_4

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity: AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.tbrLista))
        title = "My recipes"

        val recipes = arrayOf("\nHamburger \nThe best burger recipe for summertime grilling.\n", "\nPizza \nAn easy pizza crust recipe that will hold all your favorite toppings.\n", "\nCaesar Salad \nYour new favorite caesar salad, thanks to one secret ingredient.\n", "\nHomemade rocky road ice cream \nHomemade rocky road ice cream is summer in a bowl.\n")
        var adaptador = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, recipes)

        val lista = findViewById<ListView>(R.id.lstLista)
        lista.adapter = adaptador

        val botao = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(intencao)
        }

        val botaoLogout = findViewById<ImageButton>(R.id.btnLogout)
        botaoLogout.setOnClickListener {
            val intencao = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intencao)
        }

    }

}