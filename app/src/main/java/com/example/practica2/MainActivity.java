package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnEnviar(View view) {
        Intent intent = new Intent(MainActivity.this, actValidarLogin.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtnombre);
        EditText txtPass = (EditText)findViewById(R.id.txtpass);

        Bundle bun = new Bundle();
        bun.putString("user", txtNombre.getText().toString());
        bun.putString("pass", txtPass.getText().toString());

        intent.putExtras(bun);

        startActivity(intent);
    }
}