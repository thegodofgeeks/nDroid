package io.github.thegodofgeeks.ndroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

/**
 * Created by siddharth on 3/12/16.
 */

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);
        try {
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run(){
                    startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    finish();
                }

            },2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
