package com.kanzen.belajarpwpb.p6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kanzen.belajarpwpb.R;

import java.util.ArrayList;
import java.util.Arrays;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> listKelas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.list_kelas);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                listKelas);
        listView.setAdapter(arrayAdapter);

        listKelas.addAll(Arrays.asList(
                "RPL",
                "TKJ",
                "MM",
                "AVI",
                "TOI"
        ));
    }
}