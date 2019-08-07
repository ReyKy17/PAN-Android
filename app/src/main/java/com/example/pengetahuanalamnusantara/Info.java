package com.example.pengetahuanalamnusantara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        CardView aplikasi = (CardView) findViewById(R.id.TENTANGAPLIKASI);
        aplikasi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        TentangAplikasi.class);
                startActivityForResult(myIntent, 0);
            }
        });

        CardView pembuat = (CardView) findViewById(R.id.TENTANGPEMBUAT);
        pembuat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pindah) {
                Intent myIntent = new
                        Intent(pindah.getContext(),
                        TentangPembuat.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
