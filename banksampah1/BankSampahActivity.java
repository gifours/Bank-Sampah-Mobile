package com.example.banksampah1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BankSampahActivity extends AppCompatActivity {

    ImageButton btnBack;
    ImageView btnHome, btnTransaksi, btnProfil;
    Button map2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_banksampah);

        btnBack = findViewById(R.id.imageButton2);
        btnHome = findViewById(R.id.ic_home);
        btnTransaksi = findViewById(R.id.btn_transaksi);
        btnProfil = findViewById(R.id.ic_profil3);
        map2 = findViewById(R.id.btn_map2);

        //lihat maps
        map2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kemaps = new Intent(BankSampahActivity.this, Lokasi.class);
                startActivity(kemaps);
            }
        });

        //ke kembali
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keHome = new Intent(BankSampahActivity.this, InputDataActivity.class);
                startActivity(keHome);
            }
        });

        //ke home
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keHome = new Intent(BankSampahActivity.this, MainActivity.class);
                startActivity(keHome);
            }
        });

        //ke input data
        btnTransaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keInput = new Intent(BankSampahActivity.this, InputDataActivity.class);
                startActivity(keInput);
            }
        });

        //ke profil
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keProfil = new Intent(BankSampahActivity.this, ProfilActivity.class);
                startActivity(keProfil);
            }
        });
    }
}