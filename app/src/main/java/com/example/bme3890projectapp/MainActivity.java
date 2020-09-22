package com.example.bme3890projectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_username;
    private EditText et_password;
    private android.widget.Button login;
    private android.widget.Button signUp;
    private TextView loginError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        login = (Button) findViewById(R.id.button_login);
        signUp = (Button) findViewById(R.id.button_signUp);
        loginError = (TextView) findViewById(R.id.tv_loginError);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(et_username.getText().toString(), et_password.getText().toString());
            }
        });
    }

    public void validate(String userName, String userPassword) {
        if ((userName.toUpperCase().equals("Christia".toUpperCase())) && (userPassword.equals("1234"))) {
            android.content.Intent loginToApp = new android.content.Intent (MainActivity.this, SecondActivity.class);
            startActivity(loginToApp);
        } else {
            loginError.setText("Username or password is incorrect.");

        }

    }

    public void forgotPassword(View view){
        Intent intent = new Intent(MainActivity.this, ForgotPassword.class);
        startActivity(intent);
    }

    public void signUp(View view) {
        Intent intent = new Intent(MainActivity.this, SignUp.class);
        startActivity(intent);

    }
}
