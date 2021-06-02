package com.example.lectoescritura;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Nivel5_Ejercicio1 extends AppCompatActivity {

    Button btn1nave,btn2Rosa,btn3Ropa;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel5_ejercicio1);

        player = MediaPlayer.create(this, R.raw.act2);
        player.start();
        player.setVolume(0.8f, 0.8f);

        btn1nave = (Button) findViewById(R.id.btnNave);
        btn2Rosa = (Button) findViewById(R.id.btnRosa);
        btn3Ropa = (Button) findViewById(R.id.btnRopa);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnNave:
                btn1nave.setBackgroundColor(Color.GREEN);
                Intent miIntent = new Intent(this, Nivel5_Ejercicio2.class);
                startActivity(miIntent);
                break;
            case R.id.btnRosa:
                btn2Rosa.setBackgroundColor(Color.RED);
                break;
            case R.id.btnRopa:
                btn3Ropa.setBackgroundColor(Color.RED);
                break;
        }
    }

    public void btnPlay(View view){
        player.start();
    }

}