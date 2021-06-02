package com.example.lectoescritura;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Activity_nivel2_ejercicio1 extends Activity {

    MediaPlayer player;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nivel2_ejercicio1);

        player = MediaPlayer.create(this, R.raw.act3act4);
        player.start();
        player.setVolume(0.8f, 0.8f);
    }
    public void bMama(View view){
        Intent i = new Intent(this,Activity_nivel2_ejercicio2.class);
        startActivity(i);

    }
    public void btnError(View view){
        Intent i = new Intent(this,Nivel1_Error.class);
        startActivity(i);
    }
    public void btnPlay(View view){
        player.start();
    }
}
