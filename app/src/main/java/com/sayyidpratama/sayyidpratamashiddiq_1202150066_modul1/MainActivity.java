package com.sayyidpratama.sayyidpratamashiddiq_1202150066_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button abnormal, eatbus;
    EditText makanan, jumlah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abnormal = (Button)findViewById(R.id.makan_abnormal);
        eatbus = (Button)findViewById(R.id.makan_eatbus);
        makanan = (EditText)findViewById(R.id.nama_makanan);
        jumlah = (EditText)findViewById(R.id.jumlah_makanan);


        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proses = new Intent(MainActivity.this,SecondActivity.class);
                String tempat = abnormal.getText().toString();
                proses.putExtra("makanan", makanan.getText().toString());
                proses.putExtra("tempat", tempat);
                proses.putExtra("porsi", jumlah.getText().toString());
                startActivity(proses);

            }
        });


        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent proses = new Intent(MainActivity.this,SecondActivity.class);
                String tempat = eatbus.getText().toString();
                proses.putExtra("makanan", makanan.getText().toString());
                proses.putExtra("tempat", tempat);
                proses.putExtra("porsi", jumlah.getText().toString());
                startActivity(proses);
            }
        });
    }}
