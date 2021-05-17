package com.example.lectoescritura;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Activity_nivel2_ejercicio3 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel2_ejercicio3);
    }
    public void mapa(View view){
        Intent i = new Intent(this,Nivel1_Error.class);
        startActivity(i);

    }
    public void lima(View view){
        Intent i = new Intent(this, Nivel1_Terminado.class);
        startActivity(i);

    }
}
