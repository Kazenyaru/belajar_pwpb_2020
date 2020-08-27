package com.kanzen.belajarpwpb.p4.limaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;

import com.kanzen.belajarpwpb.R;
import com.kanzen.belajarpwpb.model.PersonModel;

public class LimaIntentMainActivity extends AppCompatActivity implements
        View.OnClickListener {
    public Button btnMoveActivity;
    public Button btnMoveWithDataActivity;
    public Button btnMoveWithObject;
    Button btnDialNumber;
    Button btnMoveResult;
    TextView tvResult;
    private int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lima_intent_main);
        btnMoveActivity = (Button) findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
        btnMoveWithDataActivity =
                (Button) findViewById(R.id.btn_move_with_data_activity);
        btnMoveWithDataActivity.setOnClickListener(this);
        btnMoveWithObject =
                (Button) findViewById(R.id.btn_move_activity_object);
        btnMoveWithObject.setOnClickListener(this);
        btnDialNumber = findViewById(R.id.btn_dial_number);
        btnDialNumber.setOnClickListener(this);
        btnMoveResult = findViewById(R.id.btn_move_for_result);
        btnMoveResult.setOnClickListener(this);
        tvResult = findViewById(R.id.tv_result);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(LimaIntentMainActivity.this,
                        LimaIntentMoveActivity.class);
                startActivity(moveIntent);

                break;

            case R.id.btn_move_with_data_activity:
                Intent moveWithDataIntent = new Intent(LimaIntentMainActivity.this,
                        LimaIntentMoveWithDataActivity.class);
                moveWithDataIntent.putExtra(LimaIntentMoveWithDataActivity.EXTRA_NAME,
                        "Rin Rin Nurmalasari");
                moveWithDataIntent.putExtra(LimaIntentMoveWithDataActivity.EXTRA_AGE,
                        24);
                startActivity(moveWithDataIntent);

                break;

            case R.id.btn_move_activity_object:
                PersonModel mPerson = new PersonModel();
                mPerson.setName("Rin Rin Nurmalasari");
                mPerson.setAge(24);

                mPerson.setEmail("rinrinnm@student.itb.ac.id");

                mPerson.setCity("Bandung");
                Intent moveWithObjectIntent = new Intent(LimaIntentMainActivity.this,
                        LimaIntentMoveWithObjectActivity.class);
                moveWithObjectIntent.putExtra(LimaIntentMoveWithObjectActivity.EXTRA_PERSON, mPerson);
                startActivity(moveWithObjectIntent);

                break;

            case R.id.btn_dial_number:
                String phoneNumber = "089603796012";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);

                break;

            case R.id.btn_open_browser:
                String url = "https://smkn4bdg.sch.id";
                Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
                bukabrowser.setData(Uri. parse(url));
                startActivity(bukabrowser);

                break;

            case R.id.btn_move_for_result:
                Intent moveForResultIntent = new Intent(LimaIntentMainActivity.this,
                        LimaIntentMoveForResultActivity.class);
                startActivityForResult(moveForResultIntent, REQUEST_CODE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent
            data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == LimaIntentMoveForResultActivity.RESULT_CODE) {
                int selectedValue =
                        data.getIntExtra(LimaIntentMoveForResultActivity.EXTRA_SELECTED_VALUE, 0);
                tvResult.setText(String.format("Hasil : %s", selectedValue));
            }
        }
    }
}