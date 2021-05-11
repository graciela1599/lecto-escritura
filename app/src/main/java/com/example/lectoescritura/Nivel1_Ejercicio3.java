package com.example.lectoescritura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Nivel1_Ejercicio3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1__ejercicio3);
    }
    public void btnRopa(View view){
        Intent i = new Intent(this,Nivel1_Terminado.class);
        startActivity(i);

    }
    public void btnNave(View view){
        Intent i = new Intent(this,Nivel1_Error.class);
        startActivity(i);
    }
}