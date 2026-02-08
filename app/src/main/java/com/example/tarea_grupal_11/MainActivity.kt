package com.example.tarea_grupal_11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tarea_grupal_11.Classes.Operaciones
import com.example.tarea_grupal_11.Classes.ResultsActivity

class MainActivity : AppCompatActivity() {

    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var btnMultiplicar: Button
    private lateinit var btnDividir: Button
    private lateinit var btnSuma: Button
    private lateinit var btnResta: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMultiplicar = findViewById(R.id.btmultiplicacion)
        btnDividir = findViewById(R.id.btdividir)
        btnSuma = findViewById(R.id.btsuma)
        btnResta = findViewById(R.id.btresta)
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)

        btnMultiplicar.setOnClickListener {
            realizarOperacion(Operaciones::multiplicacion)
        }

        btnDividir.setOnClickListener {
            realizarOperacion(Operaciones::division)
        }

        btnSuma.setOnClickListener {
            realizarOperacion(Operaciones::suma)
        }

        btnResta.setOnClickListener {
            realizarOperacion(Operaciones::resta)
        }
    }

    private fun realizarOperacion(operacion: (Operaciones) -> Double) {
        val num1Str = num1.text.toString()
        val num2Str = num2.text.toString()

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            return
        }

        val valorNum1 = num1Str.toDoubleOrNull()
        val valorNum2 = num2Str.toDoubleOrNull()

        if (valorNum1 == null || valorNum2 == null) {
            return
        }

        val op = Operaciones(valorNum1, valorNum2)
        val resultado = operacion(op)

        val intent = Intent(this, ResultsActivity::class.java)
        intent.putExtra("resultado", resultado)
        startActivity(intent)
    }

    private fun limpiar() {
        num1.text.clear()
        num2.text.clear()
    }
}
