package com.example.lectoescritura;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;

public class HistoriaChal2 extends AppCompatActivity {
    Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_chal2);
        if(Build.VERSION.SDK_INT >=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.white));
        }

        MotionLayout layout = (MotionLayout) findViewById(R.id.segundoII);
        layout.addTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {

            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {

            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int i) {
                Intent sig = new Intent(HistoriaChal2.this,MainActivity.class);
                startActivity(sig);
            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {

            }
        });
    }
}