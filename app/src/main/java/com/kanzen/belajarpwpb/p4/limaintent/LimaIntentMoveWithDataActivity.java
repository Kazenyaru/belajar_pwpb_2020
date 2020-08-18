package com.kanzen.belajarpwpb.p4.limaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.kanzen.belajarpwpb.R;

public class LimaIntentMoveWithDataActivity extends AppCompatActivity {
    public static String EXTRA_AGE = "extra age";
    public static String EXTRA_NAME = "extra name";
    private TextView tvDataRecived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lima_intent_move_with_data);
        tvDataRecived = (TextView)findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "Name : "+name+", Your Age : "+age;
        tvDataRecived.setText(text);
    }
}