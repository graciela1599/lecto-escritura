package com.example.lectoescritura;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.DirectAction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Dialog myDialog;
    ImageView btn_about;
    TextView txtClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_next(View view) {
    }

    public void btn_about(View view) {


        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.about_info, null);
        int width = LinearLayout.LayoutParams.WRAP_CONTENT, height = width;
        boolean focused = true;
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focused);
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }

}