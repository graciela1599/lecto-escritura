package com.example.lectoescritura;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Nivel3 extends AppCompatActivity {
    ArrayList<Integer> imagenes;
    ArrayList<TextView> letras;
    ArrayList<ArrayList<String>>  let_ejercicio;
    ImageView imgEjercicio;
    TextView palabra;
    String letraFaltante = "";
    Window window;
    String[] palabras_ejercicio = {"pie","sol","luna", "rosa"};
    int actividad_nivel3 = 0;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel3);

        if(Build.VERSION.SDK_INT >=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.mar));
        }
        imgEjercicio = (ImageView) findViewById(R.id.imgEjercicio);
        palabra = (TextView) findViewById(R.id.palabra);
        imagenes = new ArrayList<Integer>();
        imagenes.add(R.drawable.pie);
        imagenes.add(R.drawable.sol);
        imagenes.add(R.drawable.luna);
        imagenes.add(R.drawable.rosa);

        letras = new ArrayList<TextView>();
        letras.add(findViewById(R.id.btn_activity).findViewById(R.id.txt_Letra));
        letras.add(findViewById(R.id.btn_activity2).findViewById(R.id.txt_Letra2));
        letras.add(findViewById(R.id.btn_activity3).findViewById(R.id.txt_Letra1));

       let_ejercicio = new  ArrayList<ArrayList<String>>();

         actividad_subnivel();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void btn_actividad(View view) {
        palabra.setTextColor(Color.BLACK);
        switch (view.getId()){
            case R.id.btn_activity:
                validar_completado(letras.get(0).getText().toString());
                break;
            case R.id.btn_activity2:
                validar_completado(letras.get(1).getText().toString());
                break;
            case R.id.btn_activity3:
                validar_completado(letras.get(2).getText().toString());
                break;
        }

    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void actividad_subnivel(){
        imgEjercicio.setImageDrawable(getDrawable(imagenes.get(actividad_nivel3)));
        letra_faltante();
        int a = 0;
        for(TextView letra:letras){
            letra.setText(let_ejercicio.get(actividad_nivel3).get(a));
            a++;
        }

        actividad_nivel3++;
    }
    private void letra_faltante(){
        int rango = palabras_ejercicio[actividad_nivel3].length()-0;
        int random = (int)(Math.random()*rango);
        final long seed = System.nanoTime();

        letraFaltante = Character.toString(palabras_ejercicio[actividad_nivel3].charAt(random));

        let_ejercicio.add(new ArrayList<String>());
        let_ejercicio.get(actividad_nivel3).add(letraFaltante);

        for(int it = 0; it < 2; it++) {
            char letra_random = letraRandom();
            for (int i = 0; i < palabras_ejercicio[actividad_nivel3].length(); i++) {
                if(letra_random == palabras_ejercicio[actividad_nivel3].charAt(i)){
                    letra_random = letraRandom();
                    i = 0;
                    continue;
                }
            }
            let_ejercicio.get(actividad_nivel3).add(Character.toString(letra_random));
        }
        Collections.shuffle(let_ejercicio.get(actividad_nivel3), new Random(seed));

        String textView = "";
        for(int i = 0;i<palabras_ejercicio[actividad_nivel3].length();i++){
            if(letraFaltante.equals(Character.toString(palabras_ejercicio[actividad_nivel3].charAt(i)))) {
                textView += " _ ";
            }else{
                textView += " "+Character.toString(palabras_ejercicio[actividad_nivel3].charAt(i));
            }
        }

        palabra.setText(textView);



    }
    String texto;
    String error = "_";
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void validar_completado(String letraEscogida){
        texto = palabra.getText().toString();

        if(letraEscogida.equals(letraFaltante)){

            texto = texto.replace(error,letraEscogida);

            new CountDownTimer(1500, 500) {

                @Override
                public void onTick(long millisUntilFinished) {
                    // do something after 1s
                    palabra.setText(texto);
                    palabra.setTextColor(Color.GREEN);
                }

                @Override
                public void onFinish() {
                    palabra.setTextColor(Color.BLACK);
                    // do something end times 5s
                    if(actividad_nivel3==palabras_ejercicio.length){
                        Intent termino = new Intent(Nivel3.this, Nivel1_Terminado.class);
                        startActivity(termino);
                    }else{

                        actividad_subnivel();
                        error = "_";
                    }
                }

            }.start();


        }else{
            // En caso de presentar un error
            texto = palabra.getText().toString();

            texto = texto.replace(error,letraEscogida);
            error = letraEscogida;
            palabra.setText(texto);
            palabra.setTextColor(Color.RED);
            // Se despliega pantalla de error
            Intent error = new Intent(this, Nivel1_Error.class);
            startActivity(error);

        }
    }

    private char letraRandom(){
        int rnd = (int)(Math.random()*('z'-'a'))+'a';
        return (char)rnd;
    }
}