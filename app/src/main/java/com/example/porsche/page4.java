package com.example.porsche;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.porsche.databinding.ActivityPage4Binding;

public class page4 extends AppCompatActivity {

    ActivityPage4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPage4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = this.getIntent();
        if (intent != null){
            String name = intent.getStringExtra("name");
            String time = intent.getStringExtra("time");
            int image = intent.getIntExtra("image", R.drawable.img);

            binding.detailName.setText(name);
            binding.detailImage.setImageResource(image);

        }
    }
}