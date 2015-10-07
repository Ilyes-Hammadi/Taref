package com.cortexia.taref.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cortexia.taref.R;
import com.cortexia.taref.util.Useful;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // set the splash screen time
        Useful.splashScreen(this, MainActivity.class, 3000);
    }

}
