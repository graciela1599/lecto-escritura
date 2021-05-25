package com.example.lectoescritura;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Activity_nivel2_ejercicio2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nivel2_ejercicio2);
    }
    public void btnCorrecto(View view){
        Intent i = new Intent(this,Activity_nivel2_ejercicio3.class);
        startActivity(i);

    }
    public void btnError(View view){
        Intent i = new Intent(this, Nivel1_Error.class);
        startActivity(i);

    }
}
