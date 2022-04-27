package com.example.ex09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtValor;
    Button btnKuanza;
    Button btnReal;
    Button btnDolar;
    TextView lbResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValor = findViewById(R.id.txtValor);
        btnKuanza = findViewById(R.id.btnKuanza);
        btnReal = findViewById(R.id.btnReal);
        btnDolar = findViewById(R.id.btnDolar);
        lbResultado = findViewById(R.id.lbResultado);

        btnKuanza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    double valor = Double.parseDouble(txtValor.getText().toString());

                    if (valor <= 0) {
                        Toast.makeText(getApplicationContext(), "por favor não digite numero inferior ou igual a zero", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    lbResultado.setText("O valor em kwanzas é : " + String.format("%.2f", (valor / 0.0023)) + "KZ");
                }catch (Exception error){Toast.makeText(getApplicationContext(), "por favor preencha o campo acima", Toast.LENGTH_SHORT).show();}
            }
        });

        btnReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {

                    double valor = Double.parseDouble(txtValor.getText().toString());


                    if (valor <= 0) {
                        Toast.makeText(getApplicationContext(), "por favor não digite numero inferior ou igual a zero", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    lbResultado.setText("O valor em Real é : " + String.format("%.2f", (valor / 0.19)) + "RS$");
                }catch (Exception error){ Toast.makeText(getApplicationContext(), "por favor preencha o campo acima", Toast.LENGTH_SHORT).show(); }
            }
        });

        btnDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double valor = Double.parseDouble(txtValor.getText().toString());

                    if (valor <= 0) {
                        Toast.makeText(getApplicationContext(), "por favor não digite numero inferior ou igual a zero", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    lbResultado.setText("O valor em Dolar é : " + String.format("%.2f", (valor / 0.94)) + "US$");
                }catch (Exception error){ Toast.makeText(getApplicationContext(), "por favor preencha o campo acima", Toast.LENGTH_SHORT).show(); }

            }
        });


    }
}