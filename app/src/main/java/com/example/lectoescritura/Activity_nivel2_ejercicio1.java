package com.example.lectoescritura;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Activity_nivel2_ejercicio1 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel2_ejercicio1);
    }
    public void mama(View view){
        Intent i = new Intent(this,Nivel1_Error.class);
        startActivity(i);

    }
    public void nena(View view){
        Intent i = new Intent(this,Activity_nivel2_ejercicio1.class);
        startActivity(i);

    }
}
