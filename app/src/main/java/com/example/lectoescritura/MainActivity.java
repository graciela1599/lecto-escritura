package com.example.lectoescritura;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Dialog myDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_next(View view) {
    }

    public void btn_about(View view) {
        TextView txtClose;
        myDialog.setContentView(R.layout.about_info);
        txtClose = (TextView) myDialog.findViewById(R.id.close_about);

        txtClose.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                myDialog.dismiss();
            }
        });
        myDialog.show();
    }

}