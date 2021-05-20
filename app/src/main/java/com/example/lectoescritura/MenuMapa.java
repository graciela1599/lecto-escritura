package com.example.lectoescritura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MenuMapa extends AppCompatActivity {
    Window window;
    // The gesture threshold expressed in dp
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_menu_mapa);
        if(Build.VERSION.SDK_INT >=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.mar));
        }
    }


    public void btn_islavolcan(View view) {
    Intent i = new Intent(this,Nivel1_Ejercicio1.class);
    startActivity(i);
    }
    public void btn_back(View view) {
        Intent principal = new Intent(this,MainActivity.class);
        startActivity(principal);
    }

    // Use mGestureThreshold as a distance in pixels...
    public void btn_islagemelas(View view) {
        Intent nivel2 = new Intent(this, Activity_nivel2_ejercicio1.class);
        startActivity(nivel2);
    }

    public void btn_islafaro(View view) {
        Intent nivel4 = new Intent(this, Nivel4.class);
        startActivity(nivel4);
    }

    public void btn_islasirena(View view) {
        Intent nivel3 = new Intent(this, Nivel3.class);
        startActivity(nivel3);
    }

    public void btn_islamultiple(View view) {
        Intent memorama = new Intent(this, Memorama.class);
        startActivity(memorama);
    }

    public void btn_islaluna(View view) {
        Intent nivel5 = new Intent(this, Nivel5_Ejercicio1.class);
        startActivity(nivel5);
    }
}