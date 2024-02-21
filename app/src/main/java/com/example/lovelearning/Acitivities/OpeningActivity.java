package com.example.lovelearning.Acitivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lovelearning.R;

public class OpeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        ImageView startBtn = findViewById(R.id.start_btn);
        startBtn.setOnClickListener(v -> startActivity(new Intent(OpeningActivity.this, MainActivity.class)));
    }
}