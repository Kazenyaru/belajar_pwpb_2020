package com.kanzen.belajarpwpb.p4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kanzen.belajarpwpb.R;

public class Lat1IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat1_intent);

        final EditText textDataEdit = findViewById(R.id.edit_text_data);
        Button submitButton = findViewById(R.id.button_submit_intent);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Lat1IntentActivity.this, Lat2IntentActivity.class);
                i.putExtra("data", textDataEdit.getText().toString());
                startActivity(i);
            }
        });

    }
}