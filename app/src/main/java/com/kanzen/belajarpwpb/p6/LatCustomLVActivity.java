package com.kanzen.belajarpwpb.p6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.kanzen.belajarpwpb.R;
import com.kanzen.belajarpwpb.model.HeroModel;

import java.util.ArrayList;
import java.util.List;

public class LatCustomLVActivity extends AppCompatActivity {

    List<HeroModel> heroList;
    //the listview
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat_custom_l_v);

        initUI();
        initEvent();
    }

    public void initUI() {
        //initializing objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);
        heroList.add(new HeroModel(R.drawable.spiderman,"Spiderman",
                "Avengers"));
        heroList.add(new HeroModel(R.drawable.joker,"Joker","Injustice Gang"));

        heroList.add(new HeroModel(R.drawable.ironman,"Iron Man", "Avengers"));
        heroList.add(new HeroModel(R.drawable.doctorstrange, "Doctor Strange","Avengers"));
        heroList.add(new HeroModel(R.drawable.captainamerica,"Captain America","Avengers"));
        heroList.add(new HeroModel(R.drawable.batman, "Batman", "Justice League"));
//creating the adapter
        MyListAdapter adapter = new MyListAdapter(this, R.layout.my_custom_list, heroList);
//attaching adapter to the listview
        listView.setAdapter(adapter);
    }

    public void initEvent() {

    }
}