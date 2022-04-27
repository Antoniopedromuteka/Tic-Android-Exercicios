package com.example.ex01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        EditText txtValor = findViewById(R.id.txtValor);
        Button btnCalcular = findViewById(R.id.btnCalcular);
        TextView lbResultado = findViewById(R.id.lbResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double valor = Double.parseDouble(txtValor.getText().toString());
                    double resultado = 0;

                    resultado = (valor * 1.8) + 32;



                    lbResultado.setText("A temperatura em  Fahrenhei é de :"+ String.valueOf(resultado)+"ºF");

                }catch (Exception error){
                    lbResultado.setText(error.getMessage());
                }
            }
        });
    }
}