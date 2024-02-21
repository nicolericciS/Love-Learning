package com.example.lovelearning.Acitivities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.lovelearning.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CoursesListActivity.class)));

    }
}