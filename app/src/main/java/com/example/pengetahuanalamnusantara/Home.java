package com.example.pengetahuanalamnusantara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button info = (Button) findViewById(R.id.INFO);
        info.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        Info.class);
                startActivityForResult(myIntent, 0);
            }
        });

        CardView next = (CardView) findViewById(R.id.PULAU);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListPulau.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.LAUT);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListLaut.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.SELAT);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListSelat.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.TANJUNG);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListTanjung.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.TELUK);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListTeluk.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.DATARANTINGGI);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListDataranTinggi.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.GUNUNG);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListGunung.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.PEGUNUNGAN);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListPegunungan.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.DANAU);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListDanau.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.SUNGAI);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListSungai.class);
                startActivityForResult(myIntent, 0);
            }
        });
        next = (CardView) findViewById(R.id.WISATA);
        next.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        ListWisata.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Anda benar-benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new
                        DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int id) {
                                System.exit(0);
                            }
                        })
                .setNegativeButton("Tidak", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int arg1) {
                                dialog.cancel();
                            }
                        }).show();
    }
}