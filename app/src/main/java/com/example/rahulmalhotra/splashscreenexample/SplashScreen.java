package com.example.rahulmalhotra.splashscreenexample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_splash);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               startActivity(new Intent(getApplicationContext(), MainActivity.class));
               finish();
           }
       },2000);




    }
}
