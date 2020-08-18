package com.kanzen.belajarpwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kanzen.belajarpwpb.p1.P1IndexActivity;
import com.kanzen.belajarpwpb.p2.P2IndexActivity;
import com.kanzen.belajarpwpb.p3.P3IndexActivity;
import com.kanzen.belajarpwpb.p4.Lat1IntentActivity;
import com.kanzen.belajarpwpb.p4.LatConstrActivity;
import com.kanzen.belajarpwpb.p4.P4IndexActivity;
import com.kanzen.belajarpwpb.p4.SoalGridActivity;
import com.kanzen.belajarpwpb.p4.limaintent.LimaIntentMainActivity;

public class MainActivity extends AppCompatActivity {

    private Button[] b = new Button[4];
    private Class[] ac = {P1IndexActivity.class, P2IndexActivity.class, P3IndexActivity.class, P4IndexActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b[0] = findViewById(R.id.p1_button);
        b[1] = findViewById(R.id.p2_button);
        b[2] = findViewById(R.id.p3_button);
        b[3] = findViewById(R.id.p4_button);

        for (int i = 0; i < b.length; i++) {
            final int finalI = i;
            b[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(MainActivity.this, ac[finalI]);
                    startActivity(in);
                }
            });
        }
    }
}