package com.example.ex19;

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
        TextView lbDias = findViewById(R.id.txtDia);
        TextView lbSemana = findViewById(R.id.txtSemana);
        TextView lbMinuto = findViewById(R.id.txtMinuto);
        Button btnEnviar = findViewById(R.id.btnEnviar);


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int valor = Integer.parseInt(txtValor.getText().toString());

                    lbDias.setText("O valor em dias é : "+String.format("%d",valor/24)+" dias");
                    lbSemana.setText("O Valor em Semanas é de : "+String.format("%d",valor/168)+" semanas");
                    lbMinuto.setText("O valor é minutos é : "+String.format("%d",valor*60)+" minutos");


                }catch (Exception error){
                    Toast.makeText(getApplicationContext(), "Preencha o campo acima por favor", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}