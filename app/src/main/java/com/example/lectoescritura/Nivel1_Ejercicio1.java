package com.example.lectoescritura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nivel1_Ejercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1__ejercicio1);
    }
    public void btnMama(View view){
        Intent i = new Intent(this,Nivel1_Ejercicio2.class);
        startActivity(i);

    }
    public void btnSol(View view){
        Intent i = new Intent(this,Nivel1_Error.class);
        startActivity(i);
    }
}