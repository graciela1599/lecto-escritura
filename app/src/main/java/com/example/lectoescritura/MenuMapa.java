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

    }
    public void btn_back(View view) {
        Intent principal = new Intent(this,MainActivity.class);
        startActivity(principal);
    }

    // Use mGestureThreshold as a distance in pixels...
    public void btn_islagemelas(View view) {
    }

    public void btn_islafaro(View view) {
    }

    public void btn_islasirena(View view) {
        Intent nivel3 = new Intent(this, Nivel3.class);
        startActivity(nivel3);
    }

    public void btn_islamultiple(View view) {
    }

    public void btn_islaluna(View view) {
    }
}