package com.example.thechef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.thechef.ui.login.LoginActivity;

public class registerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button register = findViewById(R.id.regRegisterBtn);
        Button login = findViewById(R.id.havaAccount);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

    }


    public void signIn(){
        Intent intent = new Intent(registerActivity.this, LoginActivity.class);
        startActivity(intent);
    }
    public void signUp(){
        Intent intent = new Intent(registerActivity.this, MainActivity.class);
        startActivity(intent);
    }
}