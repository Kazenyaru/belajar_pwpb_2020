package com.kanzen.belajarpwpb.p5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kanzen.belajarpwpb.R;
import com.kanzen.belajarpwpb.p4.Lat1IntentActivity;
import com.kanzen.belajarpwpb.p4.LatConstrActivity;
import com.kanzen.belajarpwpb.p4.P4IndexActivity;
import com.kanzen.belajarpwpb.p4.SoalGridActivity;
import com.kanzen.belajarpwpb.p4.limaintent.LimaIntentMainActivity;
import com.kanzen.belajarpwpb.p5.lat_fragment.LatFragmentActivity;

public class P5IndexActivity extends AppCompatActivity {

    private Button[] b = new Button[1];
    private Class[] ac = {LatFragmentActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5_index);

        b[0] = findViewById(R.id.lat_f_button);

        for (int i = 0; i < b.length; i++) {
            final int finalI = i;
            b[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(P5IndexActivity.this, ac[finalI]);
                    startActivity(in);
                }
            });
        }
    }
}