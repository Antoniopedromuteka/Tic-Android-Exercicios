package com.example.ex07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    O custo ao consumidor de um carro novo é a soma do preço de fábrica com o
    percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica. Crie um
    aplicativo que receba o preço de fábrica de um veículo, o percentual de lucro do
    distribuidor e o percentual de impostos, calcule e mostre em Views:
    a) o valor correspondente ao lucro do distribuidor;
    b) o valor correspondente aos impostos;
    c) o preço final do veículo
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtPreco = findViewById(R.id.txtPreco);
        EditText txtImposto = findViewById(R.id.txtImposto);
        EditText txtLucro = findViewById(R.id.txtLucro);
        Button btnEnviar = findViewById(R.id.btnEnviar);
        TextView lbResultado1 = findViewById(R.id.txtResultado1);
        TextView lbResultado2 = findViewById(R.id.txtResultado2);
        TextView lbResultado3 = findViewById(R.id.txtResultado3);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast aviso;
                try{
                    double preco = Double.parseDouble(txtPreco.getText().toString());
                    double Imposto = Double.parseDouble(txtImposto.getText().toString());
                    double Lucro = Double.parseDouble(txtLucro.getText().toString());

                    double valorDoLucro = (preco + ((preco * Lucro)/100)) - preco;
                    double valorImposto = preco - ((preco * Imposto) / 100);
                    double valorFinal = preco + valorDoLucro + valorImposto;

                    lbResultado1.setText("o valor correspondente ao lucro do distribuidor é de : "+(valorDoLucro)+" ");
                    lbResultado2.setText("o valor correspondente ao imposto  é de : "+(valorImposto)+" ");
                    lbResultado3.setText("o preço final do veículo é de : "+valorFinal+"");


                }catch (Exception error){
                    aviso = Toast.makeText(getApplicationContext(),"Por favor digite apenas números",Toast.LENGTH_SHORT);
                    aviso.show();
                }
            }
        });



    }
}