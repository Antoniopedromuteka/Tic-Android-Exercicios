package com.example.ex11;

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

        EditText txtUsername = findViewById(R.id.txtUsername);
        EditText txtPassword = findViewById(R.id.txtPassword);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                if(!username.trim().toLowerCase().equals("user") || !password.trim().toLowerCase().equals("pass")){
                    txtUsername.setText("");
                    txtPassword.setText("");
                    return;
                }

                Toast.makeText(getApplicationContext(), "Login feito com sucesso", Toast.LENGTH_SHORT).show();

            }
        });

    }
}