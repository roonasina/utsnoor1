package com.example.utsnoor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnRgstr = findViewById(R.id.btnRegister);
        btnRgstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r = new Intent(getBaseContext(), Registrasi.class);
                startActivity(r);
            }
        });

        Button btnLgn= findViewById(R.id.btnLogin);
        btnLgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(getBaseContext(), Registrasi.class);
                startActivity(l);
            }
        });

    }
}
