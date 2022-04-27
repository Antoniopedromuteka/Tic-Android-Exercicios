package com.example.ex02;

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

        EditText txtNome1 = findViewById(R.id.txtNome1);
        EditText txtNome2 = findViewById(R.id.txtNome2);
        Button btnEnviar = findViewById(R.id.btnEnviar);
        TextView txtResultado = findViewById(R.id.txtResultado);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome1 = txtNome1.getText().toString();
                String nome2 = txtNome2.getText().toString();

                if(nome1.trim().equals("") || nome2.trim().equals("")){ txtResultado.setText("Nome não inserido, por favor preencha todos os campos"); return;};

                txtResultado.setText("olá "+nome1+" "+nome2);


            }
        });



    }
}