package com.example.banksampah1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilActivity extends AppCompatActivity {

    DatabaseHelper db;
    ImageButton btnBack2;
    ImageView btnHome, btnTransaksi;
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profil);

        btnBack2 = findViewById(R.id.btnBack2);
        btnHome = findViewById(R.id.ic_rumah);
        btnTransaksi = findViewById(R.id.ic_transaksi3);
        db = new DatabaseHelper(this);
        logout = (Button)findViewById(R.id.btn_logout2);



        // logout
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean updtSession = db.upgradeSession("kosong", 1);
                if (updtSession == true) {
                    Toast.makeText(getApplicationContext(), "Berhasil Keluar", Toast.LENGTH_SHORT).show();
                    Intent loginIntent = new Intent(ProfilActivity.this, LoginActivity.class);
                    startActivity(loginIntent);
                    finish();
                }
            }
        });


        //kembali
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        //ke bank sampah dri rekomendasi
        btnTransaksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keDetBS = new Intent(ProfilActivity.this, InputDataActivity.class);
                startActivity(keDetBS);
            }
        });

        //ke bank sampah dri rekomendasi
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keHome = new Intent(ProfilActivity.this, MainActivity.class);
                startActivity(keHome);
            }
        });


    }
}