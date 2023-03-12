package com.example.whowanttobemillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //create splash screen function
        new Handler().postDelayed(() -> {
            Intent mainIntent = new Intent(SplashScreen.this,MainActivity.class);
            SplashScreen.this.startActivity(mainIntent);
            SplashScreen.this.finish();
        }, 3000);
    }
}