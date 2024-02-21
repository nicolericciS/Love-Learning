package com.example.lovelearning.Acitivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.lovelearning.Adapter.CoursesAdapter;
import com.example.lovelearning.Domain.CoursesDomain;
import com.example.lovelearning.R;

import java.util.ArrayList;

public class CoursesListActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterCourseList;
    private RecyclerView recyclerViewCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_list);

        initRecyclerView();

        ConstraintLayout backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> startActivity(new Intent(CoursesListActivity.this, MainActivity.class)));
    }

    private void initRecyclerView() {
        ArrayList<CoursesDomain> items = new ArrayList<>();
        items.add(new CoursesDomain("Advanced certification Program in AI", 169, "ic_1"));
        items.add(new CoursesDomain("Google Cloud Platform Architecture", 69, "ic_2"));
        items.add(new CoursesDomain("Fundamental of java Programming", 150, "ic_3"));
        items.add(new CoursesDomain("Introduction to UI Design History", 79, "ic_4"));
        items.add(new CoursesDomain("PG Program in Big Data Engineering", 49, "ic_5"));

        recyclerViewCourse= findViewById(R.id.view);
        recyclerViewCourse.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterCourseList = new CoursesAdapter(items);
        recyclerViewCourse.setAdapter(adapterCourseList);
    }
}