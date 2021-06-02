package com.example.lectoescritura;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.state.State;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Nivel4 extends AppCompatActivity {


    ArrayList<ConstraintLayout> imagenes;
    TextView cuadrito;
    String[] palabritas = {"mamá", "papá", "mano", "sol", "luna", "lupa"};
    int actividad = 0;
    ArrayList<Integer> dibujos;
    ArrayList<TextView> txtOcultos;
    HashMap<String, Integer> palabrasImg;
    MediaPlayer player;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel4);

        player = MediaPlayer.create(this, R.raw.act3act4);
        player.start();
        player.setVolume(0.8f, 0.8f);

        palabrasImg = new HashMap<String,Integer>();
        imagenes = new ArrayList<ConstraintLayout>();
        dibujos = new ArrayList<Integer>();
        txtOcultos = new ArrayList<TextView>();


        palabrasImg.put("mamá", R.drawable.mama);
        palabrasImg.put("papá", R.drawable.papa);
        palabrasImg.put("mano", R.drawable.mano);
        palabrasImg.put("sol", R.drawable.sol);
        palabrasImg.put("luna", R.drawable.luna);
        palabrasImg.put("lupa", R.drawable.lupa);

        imagenes.add(findViewById(R.id.imgOpcion1));
        imagenes.add(findViewById(R.id.imgOpcion2));
        imagenes.add(findViewById(R.id.imgOpcion3));

        txtOcultos.add(findViewById(R.id.imgOpcion1).findViewById(R.id.txtopcion1));
        txtOcultos.add(findViewById(R.id.imgOpcion2).findViewById(R.id.txtopcion2));
        txtOcultos.add(findViewById(R.id.imgOpcion3).findViewById(R.id.txtopcion3));


        cuadrito = findViewById(R.id.palabra_nv4);

        dibujos.add(R.drawable.mama);
        dibujos.add(R.drawable.papa);
        dibujos.add(R.drawable.sol);
        dibujos.add(R.drawable.mano);
        dibujos.add(R.drawable.nave);
        dibujos.add(R.drawable.rosa);
        dibujos.add(R.drawable.luna);
        dibujos.add(R.drawable.ropa);
        dibujos.add(R.drawable.lupa);

        devolverDibujos();

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void btn_actividad4(View view) {
        switch(view.getId()){
            case R.id.imgOpcion1:
               validar(txtOcultos.get(0).getText().toString());
               break;
            case R.id.imgOpcion2:
                validar(txtOcultos.get(1).getText().toString());
                break;
            case R.id.imgOpcion3:
                validar(txtOcultos.get(2).getText().toString());
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void devolverDibujos(){
        ArrayList<Integer> opcionesImg = new ArrayList<Integer>();
        cuadrito.setText(palabritas[actividad]);
        int imagen = palabrasImg.get(palabritas[actividad]); // obtienes img
        Drawable ant = null;
        final long seed = System.nanoTime();
        opcionesImg.add(imagen);

        for(int i = 0;i<2;i++){
            int random = (int)(Math.random()*(dibujos.size()-1));
            while(opcionesImg.contains(dibujos.get(random))){
                random = (int)(Math.random()*(dibujos.size()-1));
            }

            opcionesImg.add(dibujos.get(random));
        }
        Collections.shuffle(opcionesImg, new Random(seed));
        int i = 0;
        for(ConstraintLayout opcion:imagenes){
            if(opcionesImg.get(i) == imagen){
                txtOcultos.get(i).setText(palabritas[actividad]);
            }
            opcion.setBackground(getDrawable(opcionesImg.get(i)));
            i++;
        }

    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void validar(String img_clic){

        if(img_clic.equals(palabritas[actividad])){
            ++actividad;
            if(actividad == palabritas.length){
                Intent terminar = new Intent(this, Nivel1_Terminado.class);
                startActivity(terminar);
            }else {
                devolverDibujos();
            }
        }else{
            // Esta mal :c
            Intent error = new Intent(this, Nivel1_Error.class);
            startActivity(error);
        }
    }

    private char letraRandom(){
        int rnd = (int)(Math.random()*('s'-'c'))+'c';
        return (char)rnd;
    }

    public void btnPlay(View view){
        player.start();
    }

}