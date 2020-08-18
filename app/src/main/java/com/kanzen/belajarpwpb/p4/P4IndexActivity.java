package com.kanzen.belajarpwpb.p4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kanzen.belajarpwpb.R;
import com.kanzen.belajarpwpb.p1.LatLR3Activity;
import com.kanzen.belajarpwpb.p4.limaintent.LimaIntentMainActivity;

public class P4IndexActivity extends AppCompatActivity {

    private Button[] b = new Button[4];
    private Class[] ac = {LatConstrActivity.class, SoalGridActivity.class, Lat1IntentActivity.class, LimaIntentMainActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4_index);

        b[0] = findViewById(R.id.soal_g_button);
        b[1] = findViewById(R.id.lat_c_button);
        b[2] = findViewById(R.id.lat_i_1_button);
        b[3] = findViewById(R.id.lat_i_2_button);

        for (int i = 0; i < b.length; i++) {
            final int finalI = i;
            b[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(P4IndexActivity.this, ac[finalI]);
                    startActivity(in);
                }
            });
        }
    }
}