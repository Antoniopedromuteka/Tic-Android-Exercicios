package com.example.ex06;

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
        EditText txtPeso = findViewById(R.id.txtPeso);
        Button btnEnviar = findViewById(R.id.btnEnviar);
        TextView lbResultado = findViewById(R.id.lbResultado);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast aviso;
                try {
                    double peso = Double.parseDouble(txtPeso.getText().toString());

                    lbResultado.setText("Se a pessoa engordar o peso será de : "+(peso + (peso*0.15))+"kg e se emagrecer o peso será de : "+(peso - (peso*0.20))+"kg ");

                }catch (Exception error){
                    aviso = Toast.makeText(getApplicationContext(),"Por favor digite apenas numeros",Toast.LENGTH_SHORT);
                    aviso.show();
                }
            }
        });
    }
}