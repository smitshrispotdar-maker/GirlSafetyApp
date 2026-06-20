package com.example.safeher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText email,password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            LoginActivity.this,
                            HomeActivity.class);

            startActivity(intent);

        });

    }
}