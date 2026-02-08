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

import com.example.tarea_grupal_11.Classes.Suma;

public class MainActivity extends AppCompatActivity {

    Button btsuma, btresta;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        btsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"hola",Toast.LENGTH_LONG.show());
                Sumar();
            }

        });

        btresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(),"hola",Toast.LENGTH_LONG.show());
                Restar();
            }

        });
        
        





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void Restar() {
    }

    private void Sumar() {

        if (num1.getText().toString().isEmpty() ||
                num2.getText().toString().isEmpty()) {
            return;
        }
        double valorNum1 = Double.parseDouble(num1.getText().toString());
        double valorNum2 = Double.parseDouble(num2.getText().toString());

        Suma operacion = new Suma(valorNum1, valorNum2);

    }
    }
}