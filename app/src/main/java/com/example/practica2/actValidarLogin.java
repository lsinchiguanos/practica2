package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.practica2.WebServices.Asynchtask;
import com.example.practica2.WebServices.WebService;

import org.json.JSONException;

import java.util.HashMap;
import java.util.Map;

public class actValidarLogin extends AppCompatActivity implements Asynchtask {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_validar_login);
        Bundle bun = this.getIntent().getExtras();
        Map<String,String> datos = new HashMap<String, String>();
        WebService ws = new WebService("http://uealecpeterson.net/ws/login.php?usr=" + bun.getString("user") + "&pass=" + bun.getString("pass"), datos, actValidarLogin.this, actValidarLogin.this);
        ws.execute("GET");


    }

    @Override
    public void processFinish(String result) throws JSONException {
        TextView txtSaludos = (TextView)findViewById(R.id.lbmensaje);
        txtSaludos.setText("Respuesta del WS: " + result);
    }
}