package com.example.lectoescritura;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Nivel5_Ejercicio2 extends AppCompatActivity {

    Button btn1Sol,btn2Mano,btn3Mama;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel5_ejercicio2);

        player = MediaPlayer.create(this, R.raw.act2);
        player.start();
        player.setVolume(0.8f, 0.8f);

        btn1Sol = (Button) findViewById(R.id.btnSol);
        btn2Mano = (Button) findViewById(R.id.btnMano);
        btn3Mama = (Button) findViewById(R.id.btnMama);

    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnSol:
                btn1Sol.setBackgroundColor(Color.GREEN);
                Intent miIntent = new Intent(Nivel5_Ejercicio2.this, Nivel5_Ejercicio3.class);
                startActivity(miIntent);
                break;
            case R.id.btnMano:
                btn2Mano.setBackgroundColor(Color.RED);
                break;
            case R.id.btnMama:
                btn3Mama.setBackgroundColor(Color.RED);
                break;
        }
    }

    public void btnPlay(View view){
        player.start();
    }

}