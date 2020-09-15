package com.kanzen.belajarpwpb.p6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kanzen.belajarpwpb.R;

public class LatInputActivity extends AppCompatActivity {

    EditText bil1;
    EditText bil2;
    Button kalkulasi;
    EditText hasilKalkulasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat_input);

        initUI();
        initEvent();
    }

    private void initUI() {
        bil1 = (EditText) findViewById(R.id.bil1);
        bil2 = (EditText) findViewById(R.id.bil2);
        kalkulasi = (Button) findViewById(R.id.kalkulasi);
        hasilKalkulasi = (EditText) findViewById(R.id.hasil_penjumlahan_value);
    }

    private void initEvent() {
        kalkulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah() {
        int angka1 = 0;
        int angka2 = 0;
        int total = 0;
        try {
            angka1 = Integer.parseInt(bil1.getText().toString());
            angka2 = Integer.parseInt(bil2.getText().toString());
        } catch (Exception e) {
            bil1.setError("Harus Diisi");
            bil2.setError("Harus Diisi");
        }
        total = angka1 + angka2;
        hasilKalkulasi.setText("" + total);
    }
}