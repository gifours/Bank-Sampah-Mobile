package com.example.banksampah1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.banksampah1.MainActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class InputDataActivity extends AppCompatActivity {

    Spinner spinnerJenisBarang, spinnerOpsi;
    ImageView icProfil2, icRumah2, btngambar1, lrek1;
    Button btnPesan;
    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_input_data);

        icRumah2 = findViewById(R.id.ic_rumah2);
        icProfil2 = findViewById(R.id.ic_profil2);
        btngambar1 = findViewById(R.id.btn_gambar1);
        btnBack = findViewById(R.id.imageButton);

        //ke beranda
        icRumah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keHome = new Intent( InputDataActivity.this, MainActivity.class);
                startActivity(keHome);
            }
        });

        //ke profil
        icProfil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keProfil = new Intent(InputDataActivity.this, ProfilActivity.class);
                startActivity(keProfil);
            }
        });

        //ke gambar1
        btngambar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent keGambar1 = new Intent(InputDataActivity.this, BankSampahActivity.class);
                startActivity(keGambar1);
            }
        });

        //ke checkout
//        btnPesan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent keCheckout = new Intent(InputDataActivity.this, CheckoutActivity.class);
//                startActivity(keCheckout);
//            }
//        });

        //ke kembali
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}