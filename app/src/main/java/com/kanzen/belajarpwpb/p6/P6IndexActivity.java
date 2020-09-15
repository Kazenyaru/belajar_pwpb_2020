package com.kanzen.belajarpwpb.p6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kanzen.belajarpwpb.R;
import com.kanzen.belajarpwpb.p5.P5IndexActivity;
import com.kanzen.belajarpwpb.p5.lat_fragment.LatFragmentActivity;

public class P6IndexActivity extends AppCompatActivity {

    private Button[] b = new Button[3];
    private Class[] ac = {ListViewActivity.class, LatInputActivity.class,
            LatCustomLVActivity.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p6_index);

        b[0] = findViewById(R.id.lat_list_view_button);
        b[1] = findViewById(R.id.lat_input_button);
        b[2] = findViewById(R.id.lat_custom_lv_button);

        for (int i = 0; i < b.length; i++) {
            final int finalI = i;
            b[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(P6IndexActivity.this, ac[finalI]);
                    startActivity(in);
                }
            });
        }
    }
}