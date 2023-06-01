package com.example.banksampah1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper db;
    Button logout, map;
    ImageView imageProfil, transaksi, profil;
    TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        transaksi = findViewById(R.id.ic_transaksi);
        profil = findViewById(R.id.ic_profil);
        db = new DatabaseHelper(this);
        harga = findViewById(R.id.tvLihatSemua);

        Boolean checkSession = db.checkSession("ada");
        if (checkSession == false) {
            Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }


        //daftar harga
        harga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this, DaftarHargaActivity.class);
                startActivity(registerIntent);
                finish();
            }
        });

        //ke profil
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keProfil2 = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(keProfil2);
            }
        });

        //ke input data
        transaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keInput = new Intent(MainActivity.this, InputDataActivity.class);
                startActivity(keInput);
            }
        });



    }
}