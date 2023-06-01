package com.example.banksampah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private  static int SPLASH_SCREEN = 4000;

    Animation topAnim, bottomAnim, topAnim1;
    TextView tvBank, tvSampah;
    ImageView tvLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        //animasi
        topAnim1 = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        tvLogo = findViewById(R.id.tvLogo);
        tvBank = findViewById(R.id.tvBank);
        tvSampah = findViewById(R.id.tvSampah);

        tvLogo.setAnimation(topAnim1);
        tvBank.setAnimation(topAnim);
        tvSampah.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent keMasuk = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(keMasuk);
                finish();
            }
        }, SPLASH_SCREEN);
    }
}