package com.example.miprimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var refResultado:TextView
    lateinit var boton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Estados","Create( inicia todo)")
        setContentView(R.layout.activity_main)
        boton=findViewById(R.id.BModificar) as Button

        boton.setOnClickListener(){
            modifica()
        }
    }

    fun modifica(){
        refResultado=findViewById<TextView>(R.id.tvResultado)
        refResultado.append("\nHola Android")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Estados","start (visible)")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Estados","Pause ( parcialmente visible)")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Estados","Stop (Parado no visible)")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Estados","Restart( visible crea todo de nuevo)")
    }

    
}