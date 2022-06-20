package com.example.pratica_4

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_lista)
        setSupportActionBar(findViewById(R.id.tbrLista))
        setTitle("My recipes")

        val recipes = arrayOf("Hamburger", "Pizza", "Caesar Salad")
        var adaptador = ArrayAdapter<String>(this,
            android.R.layout.simple_list_item_1, recipes)

        val lista = findViewById<ListView>(R.id.lstLista)
        lista.adapter = adaptador

        val botao = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        botao.setOnClickListener {
            val intencao = Intent(applicationContext, CadastroActivity::class.java)
            startActivity(intencao)
        }
    }

}