package com.kanzen.belajarpwpb.p4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.kanzen.belajarpwpb.R;

public class Lat2IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat2_intent);

        TextView viewDataText = findViewById(R.id.text_view_data);
        Bundle bundle = getIntent().getExtras();
        String dataFromIntent = bundle.getString("data");
        viewDataText.setText(dataFromIntent);
    }
}