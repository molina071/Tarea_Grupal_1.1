package com.example.tarea_grupal_11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    int suma;

    EditText num1 , num2, result;
    Button btn_multiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn_multiplicar = ( Button) findViewById(R.id.btn_multiplicar);



        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double valorNum1 = 0;
                double valorNum2 = 0;

                num1 = (EditText) findViewById(R.id.num1);
                valorNum1 = Double.parseDouble(num1.getText().toString());
                num2 = (EditText) findViewById(R.id.num2);
                valorNum2 = Double.parseDouble(num1.getText().toString());
                result = (EditText) findViewById(R.id.result);

                if (valorNum1 < 0 || valorNum2 < 0) {
                    Toast.makeText(getApplicationContext(), "los numero ingresados no deben ser menores a 0: ", Toast.LENGTH_LONG).show();
                }else
                multiplicar(valorNum1, valorNum2);
                limpiar();
            }
        });
    }
    private void limpiar() {
         num1.setText(null);
         num2.setText(null);
    }
    private void multiplicar(double num1 , double num2 ) {

        double multi = num1 * num2;

        String resultado = String.valueOf(multi);

        result.setText(resultado);
    }


}