package com.example.ex18;

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

        EditText txtValor = findViewById(R.id.txtValor);
        TextView lbResultado = findViewById(R.id.txtResultado);
        Button btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    int valor = Integer.parseInt(txtValor.getText().toString());
                    int cont=0;
                    for (int i = 1; i<=valor;i++){
                        if(valor % i == 0){
                            cont ++;
                        }
                    }
                    if(cont != 2){ lbResultado.setText("O numero "+valor+" não é Primo"); return;}

                    lbResultado.setText("O numero "+valor+" é Primo");

                }catch (Exception error){
                    Toast.makeText(getApplicationContext(), "Por favor preencha o campo acima", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}