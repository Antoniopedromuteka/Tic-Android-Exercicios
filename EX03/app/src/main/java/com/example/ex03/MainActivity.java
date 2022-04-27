package com.example.ex03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtNome = findViewById(R.id.txtNome);
        EditText txtSobrenome = findViewById(R.id.txtSobrenome);
        Button enviar = findViewById(R.id.btnEnviar);


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = txtNome.getText().toString();
                String sobrenome = txtSobrenome.getText().toString();
                Toast aviso;

                if(nome.trim().equals("") || sobrenome.trim().equals("")){
                    aviso = Toast.makeText(getApplicationContext(),"Preencha todos os campos por favor",Toast.LENGTH_SHORT);
                    aviso.show();
                    return;
                };

                aviso = Toast.makeText(getApplicationContext(),"Olá "+nome+" "+sobrenome+" ",Toast.LENGTH_SHORT);
                aviso.show();


            }
        });


    }
}