package com.example.rootapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_splash);

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent intent=new Intent(Splash_Activity.this,MainActivity.class);
                 startActivity(intent);
                 finish();
             }
         },2000);




    }}