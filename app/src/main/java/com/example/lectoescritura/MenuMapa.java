package com.example.lectoescritura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuMapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_menu_mapa);
    }
    public void btn_islavolcan(View view) {
        ImageView islavolcan = (ImageView)findViewById(R.id.islavolcan);
        islavolcan.setHovered(true);
    }
}