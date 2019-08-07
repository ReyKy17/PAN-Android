package com.example.pengetahuanalamnusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListPegunungan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pegunungan);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button next = (Button) findViewById(R.id.Selengkapnya1);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenPGBukitBarisan.class);
                startActivityForResult(myIntent, 0);
            }
        });

        next = (Button) findViewById(R.id.Selengkapnya2);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenPGJayaWijaya.class);
                startActivityForResult(myIntent, 0);
            }
        });

        next = (Button) findViewById(R.id.Selengkapnya3);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenPGKapurUtara.class);
                startActivityForResult(myIntent, 0);
            }
        });

        next = (Button) findViewById(R.id.Selengkapnya4);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenPGSchwaner.class);
                startActivityForResult(myIntent, 0);
            }
        });

        next = (Button) findViewById(R.id.Selengkapnya5);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenPGMenoreh.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button info = (Button) findViewById(R.id.INFO);
        info.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        Info.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
