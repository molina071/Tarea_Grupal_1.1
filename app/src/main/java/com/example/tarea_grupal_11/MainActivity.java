package com.example.tarea_grupal_11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    int suma;

    EditText num1 , num2;
    Button btn_multiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

         num1 = (EditText) findViewById(R.id.num1);
         num2 = (EditText) findViewById(R.id.num2);

        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                multiplicar(num1, num2);
            }
        });


    }

    private void multiplicar(int num1 , int num2 ) {

        int resultado = num1 * num2;


    }
}