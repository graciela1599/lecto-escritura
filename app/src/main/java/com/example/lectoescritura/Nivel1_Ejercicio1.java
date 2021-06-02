package com.example.lectoescritura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Nivel1_Ejercicio1 extends AppCompatActivity {

    MediaPlayer player;
    MediaPlayer player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1__ejercicio1);

        player = MediaPlayer.create(this, R.raw.act1pt1);
        player.start();
        player.setVolume(0.8f, 0.8f);
    }
    public void btnMama(View view){
        Intent i = new Intent(this,Nivel1_Ejercicio2.class);
        startActivity(i);
    }
    public void btnSol(View view){
        Intent i = new Intent(this,Nivel1_Error.class);
        startActivity(i);
    }
    public void btnPlay(View view){
        player.start();
    }
    public void btnPlay2(View view){
        player2 = MediaPlayer.create(this, R.raw.act1pt2);
        player2.start();
        player2.setVolume(0.8f, 0.8f);
    }
}