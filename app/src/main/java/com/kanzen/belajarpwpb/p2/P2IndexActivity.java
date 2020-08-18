package com.kanzen.belajarpwpb.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kanzen.belajarpwpb.R;

public class P2IndexActivity extends AppCompatActivity {

    private Button[] b = new Button[2];
    private Class[] ac = {SoalLR1Activity.class, SoalLR2Activity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2_index);

        b[0] = findViewById(R.id.soal_r_l_1_button);
        b[1] = findViewById(R.id.soal_r_l_2_button);

        for (int i = 0; i < b.length; i++) {
            final int finalI = i;
            b[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(P2IndexActivity.this, ac[finalI]);
                    startActivity(in);
                }
            });
        }
    }
}