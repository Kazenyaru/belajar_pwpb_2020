package com.kanzen.belajarpwpb.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kanzen.belajarpwpb.R;

public class P1IndexActivity extends AppCompatActivity {

    private Button[] b = new Button[3];
    private Class[] ac = {LatLR1Activity.class, LatLR2Activity.class, LatLR3Activity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1_index);

        b[0] = findViewById(R.id.lat_r_l_1_button);
        b[1] = findViewById(R.id.lat_r_l_2_button);
        b[2] = findViewById(R.id.lat_r_l_3_button);

        for (int i = 0; i < b.length; i++) {
            final int finalI = i;
            b[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(P1IndexActivity.this, ac[finalI]);
                    startActivity(in);
                }
            });
        }
    }
}