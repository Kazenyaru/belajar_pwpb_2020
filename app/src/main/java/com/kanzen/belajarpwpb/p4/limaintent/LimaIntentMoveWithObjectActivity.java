package com.kanzen.belajarpwpb.p4.limaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.kanzen.belajarpwpb.R;
import com.kanzen.belajarpwpb.model.PersonModel;

public class LimaIntentMoveWithObjectActivity extends AppCompatActivity {
    public static String EXTRA_PERSON = " extra_person";
    public TextView tvObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lima_intent_move_with_object);
        tvObject = (TextView)findViewById(R.id.tv_object_received);
        PersonModel mPerson = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Name : " + mPerson.getName() + ", Email : " + mPerson.getEmail() + ", Age : " + mPerson.getAge() + ", Location : " + mPerson.getCity();
        tvObject.setText(text);
    }
}