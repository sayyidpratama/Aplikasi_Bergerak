package com.sayyidpratama.sayyidpratamashiddiq_1202150066_modul1;

/**
 * Created by SP-SHOCK on 2/4/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import static java.lang.Integer.parseInt;

public class SecondActivity extends AppCompatActivity {
    //    Deklarasi variabel
    int uangSaku = 65000;
    int biaya, total, hargaTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        TextView Makanan = (TextView) findViewById(R.id.makanan);
        TextView jumlah = (TextView) findViewById(R.id.jumlah);
        TextView lokasi = (TextView) findViewById(R.id.TextView2);
        TextView hasil = (TextView) findViewById(R.id.harga);
        Intent main = getIntent();


        String makanan = main.getStringExtra("makanan");
        String Lokasi = main.getStringExtra("tempat");
        String banyak = main.getStringExtra("porsi");


        Makanan.setText(makanan);
        jumlah.setText(banyak);
        lokasi.setText(Lokasi);

        switch (Lokasi) {
            case "EATBUS":
                biaya = 50000;
                break;
            case "ABNORMAL":
                biaya = 30000;
                break;
        }
        total = parseInt(banyak) * biaya;
        String hargaTotal = Integer.toString(total);
        if (uangSaku < total) {
            hasil.setText("Rp" + hargaTotal);
            Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup!!!", Toast.LENGTH_SHORT).show();
        } else {
            hasil.setText("Rp" + hargaTotal);
            Toast.makeText(this, "Disini Aja makan malamnya, uang kamu cukup :)", Toast.LENGTH_SHORT).show();
        }
    }

}