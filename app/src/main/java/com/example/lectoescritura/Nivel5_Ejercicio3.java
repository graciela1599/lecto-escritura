package com.example.lectoescritura;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Nivel5_Ejercicio3 extends AppCompatActivity {

    Button btn1Casa,btn2Arbol,btn3Cielo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel5_ejercicio3);

        btn1Casa = (Button) findViewById(R.id.btnCasa);
        btn2Arbol = (Button) findViewById(R.id.btnArbol);
        btn3Cielo = (Button) findViewById(R.id.btnCielo);

    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnCasa:
                btn1Casa.setBackgroundColor(Color.GREEN);
                Intent miIntent = new Intent(Nivel5_Ejercicio3.this, Nivel1_Terminado.class);
                startActivity(miIntent);
                break;
            case R.id.btnArbol:
                btn2Arbol.setBackgroundColor(Color.RED);
                break;
            case R.id.btnCielo:
                btn3Cielo.setBackgroundColor(Color.RED);
                break;
        }
    }
}