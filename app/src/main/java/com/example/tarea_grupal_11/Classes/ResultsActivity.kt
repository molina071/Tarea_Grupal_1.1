package com.example.tarea_grupal_11.Classes

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea_grupal_11.R

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results)

        val resultTextView: TextView = findViewById(R.id.results)
        val resultado = intent.getDoubleExtra("resultado", 0.0)
        resultTextView.text = "Resultado: $resultado"
    }
}
