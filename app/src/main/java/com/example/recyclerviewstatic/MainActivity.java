package com.example.recyclerviewstatic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView courselist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courselist = findViewById(R.id.recycleview);
        courselist.setLayoutManager(new LinearLayoutManager(this));
        String course[] = {"java","html","android","flutter","React native","python","php","javascript","html","android","flutter","React native","python","php","javascript"};
        courselist.setAdapter(new CourseAdapter(course));

    }
}
