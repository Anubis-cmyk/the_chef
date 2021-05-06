package com.example.thechef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.thechef.ui.login.LoginActivity;

public class StartActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start2);

        Button loginBtn = findViewById(R.id.loginBtn);
        Button register = findViewById(R.id.registerBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });



    }

    public void signIn(){
        Intent intent = new Intent(StartActivity2.this, LoginActivity.class);
        startActivity(intent);
    }
    public void signUp(){
        Intent intent = new Intent(StartActivity2.this, registerActivity.class);
        startActivity(intent);
    }
}