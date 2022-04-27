package com.example.ex08;

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

        /*
         Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um
         aplicativo que receba em Views, o valor do salário mínimo e a quantidade de quilowatts
         consumida por uma residência. Calcule e mostre:
         a) o valor de cada quilowatt;
         b) o valor a ser pago por essa residência;
         c) o valor a ser pago com desconto de 15%.
         */

        EditText txtSalminimo = findViewById(R.id.txtSalminimo);
        EditText txtQtd = findViewById(R.id.txtQtd);
        Button btnEnviar = findViewById(R.id.btnEnviar);
        TextView lbResultado = findViewById(R.id.lbResultado);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast aviso;
                try {
                    double salmin = Double.parseDouble(txtSalminimo.getText().toString());
                    int qtd = Integer.parseInt(txtQtd.getText().toString());
                    double valor = (salmin * (0.2 * qtd));
                    double valorDesconto = valor - ((valor * 15) / 100);

                    if(txtSalminimo.getText().toString().equals("") || txtQtd.getText().toString().equals("")){
                       aviso = Toast.makeText(getApplicationContext(),"Por favor preencha todos os campos ",Toast.LENGTH_SHORT);
                       aviso.show();
                        return;
                    };

                    lbResultado.setText("O valor de cada quilowatt e de: " + (salmin / qtd) + "" +
                            " o valor a ser pago por essa residência e de :" +
                            " " + valor + "" +
                            " o valor a ser pago com desconto de 15% e de : " + (valorDesconto) + " ");
                }catch (Exception error){
                    aviso = Toast.makeText(getApplicationContext(),"Por favor digite apenas numeros",Toast.LENGTH_SHORT);
                    aviso.show();
                }

            }
        });



    }
}