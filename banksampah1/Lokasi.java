package com.example.banksampah1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Lokasi extends FragmentActivity implements OnMapReadyCallback{

    GoogleMap map;
    ImageButton back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lokasi);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        back = (ImageButton)findViewById(R.id.btn_back);

        //kembali
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng sampah = new LatLng(-7.8015958935914504, 110.35926843292616);
        map.addMarker(new MarkerOptions().position(sampah).title("Bank Sampah Surolaras"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sampah));

        float zoomlevel = 13.0f;
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sampah, zoomlevel));


    }


}
