package com.example.pengetahuanalamnusantara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListDanau extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_danau);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button next = (Button) findViewById(R.id.Selengkapnya1);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenDanauMatano.class);
                startActivityForResult(myIntent, 0);
            }
        });

        next = (Button) findViewById(R.id.Selengkapnya2);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenDanauPoso.class);
                startActivityForResult(myIntent, 0);
            }
        });

        next = (Button) findViewById(R.id.Selengkapnya3);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenDanauSentarum.class);
                startActivityForResult(myIntent, 0);
            }
        });

        next = (Button) findViewById(R.id.Selengkapnya4);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenDanauToba.class);
                startActivityForResult(myIntent, 0);
            }
        });

        next = (Button) findViewById(R.id.Selengkapnya5);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        KontenDanauTuwoti.class);
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
