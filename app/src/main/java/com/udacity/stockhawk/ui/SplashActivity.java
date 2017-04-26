package com.udacity.stockhawk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;

import com.udacity.stockhawk.R;
import com.udacity.stockhawk.StockHawkApp;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent startActivity = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(startActivity);
                finish();
            }
        }, 3000);

    }

}
