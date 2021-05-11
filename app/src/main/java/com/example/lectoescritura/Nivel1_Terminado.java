package com.example.lectoescritura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nivel1_Terminado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1__terminado);
    }

    public void btnBack(View view){
        Intent i = new Intent(this,MenuMapa.class);
        startActivity(i);
    }

}