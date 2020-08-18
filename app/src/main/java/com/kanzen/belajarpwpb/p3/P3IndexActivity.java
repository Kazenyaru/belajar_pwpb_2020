package com.kanzen.belajarpwpb.p3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kanzen.belajarpwpb.R;
import com.kanzen.belajarpwpb.p1.LatLR1Activity;
import com.kanzen.belajarpwpb.p1.LatLR2Activity;
import com.kanzen.belajarpwpb.p1.LatLR3Activity;
import com.kanzen.belajarpwpb.p1.P1IndexActivity;

public class P3IndexActivity extends AppCompatActivity {

    private Button[] b = new Button[3];
    private Class[] ac = {LatT1Activity.class, LatT2Activity.class, LatT3Activity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3_index);

        b[0] = findViewById(R.id.lat_t_1_button);
        b[1] = findViewById(R.id.lat_t_2_button);
        b[2] = findViewById(R.id.lat_t_3_button);

        for (int i = 0; i < b.length; i++) {
            final int finalI = i;
            b[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(P3IndexActivity.this, ac[finalI]);
                    startActivity(in);
                }
            });
        }
    }
}