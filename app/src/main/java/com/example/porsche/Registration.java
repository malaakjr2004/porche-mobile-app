package com.example.porsche;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        final EditText editTextUsername = findViewById(R.id.editTextUsername);
        final EditText editTextEmail = findViewById(R.id.editTextEmail);
        final EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonRegister = findViewById(R.id.buttonRegister);



        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // You can add validation and registration logic here.
                // For simplicity, let's display a toast message.
                Toast.makeText(Registration.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                Intent i =new Intent(Registration.this,Login.class);
                startActivity(i);
            }
        });
    }
}