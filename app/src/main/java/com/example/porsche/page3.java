package com.example.porsche;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.porsche.databinding.ActivityPage3Binding;


import java.util.ArrayList;

public class page3 extends AppCompatActivity {

    ActivityPage3Binding binding;
    ListAdapter listAdapter;
    ListView listview;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPage3Binding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_page3);
        listview = findViewById(R.id.listview);
        int[] imageList = {R.drawable.aventador,R.drawable.diablo,R.drawable.huracan};
        String[] nameList = {"Aventador", "Diablo", "Huracan"};

        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i], imageList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new ListAdapter(page3.this, dataArrayList);
        listview.setAdapter(listAdapter);
        listview.setClickable(true);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(page3.this, page4.class);
                intent.putExtra("name", nameList[i]);
                intent.putExtra("image", imageList[i]);
                startActivity(intent);
            }
        });
    }
}