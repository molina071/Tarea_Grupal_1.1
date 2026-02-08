package com.example.tarea_grupal_11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tarea_grupal_11.Classes.Operaciones;


public class MainActivity extends AppCompatActivity {


    EditText num1;
    EditText num2;
    TextView result;
    Button btn_multiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn_multiplicar = ( Button) findViewById(R.id.btmultiplicacion);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (android.widget.TextView) findViewById(R.id.lresultado);

        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicar();
            }
        });
    }

    private void multiplicar() {
        if (num1.getText().toString().isEmpty() ||
                num2.getText().toString().isEmpty()) {
            return;
        }

        double valorNum1 = Double.parseDouble(num1.getText().toString());
        double valorNum2 = Double.parseDouble(num2.getText().toString());
        Operaciones op = new Operaciones(valorNum1, valorNum2);

        double resultado = op.multiplicacion();

        Intent intent = new Intent(this, result.getClass());
        intent.putExtra("resultado", resultado);
        startActivity(intent);

    }

    private void limpiar() {
         num1.setText(null);
         num2.setText(null);
    }









}