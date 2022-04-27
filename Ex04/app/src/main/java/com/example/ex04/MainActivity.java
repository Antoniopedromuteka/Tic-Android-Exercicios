package com.example.ex04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtAnoNascimento = findViewById(R.id.txtNascimento);
        EditText txtAnoActual = findViewById(R.id.txtActual);
        Button btnCalcular=findViewById(R.id.btnCalcular);
        TextView lbResultado=findViewById(R.id.lbResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int anoNascimento = Integer.parseInt(txtAnoNascimento.getText().toString());
                    int anoActual = Integer.parseInt(txtAnoActual.getText().toString());
                    int idadeActual = (anoNascimento < anoActual) ? anoActual - anoNascimento : -1;
                    int idade2050 = 2050 - anoNascimento;

                    if (idadeActual == -1) {
                        lbResultado.setText("o ano de nascumento tem de ser menor que o ano actual");
                    } else {
                        lbResultado.setText("a sua idade actual é : " + idadeActual + " e a sua idade em 2050 será : " + idade2050 + "");
                    }
                }catch (Exception error){
                    Toast aviso = Toast.makeText(getApplicationContext(),"por favor digite numeros",Toast.LENGTH_SHORT);
                    aviso.show();
                }
            }
        });
    }
}