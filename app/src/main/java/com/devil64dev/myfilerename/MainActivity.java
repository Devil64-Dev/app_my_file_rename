package com.devil64dev.myfilerename;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String [] myDataTitle = {"Replace characters", "Insert characters", "Add auto-numeration"};
    private String [] myDataDescription = {"Replace specific char of string by a new string or char.",
    "Insert specific char or string in specific position", "Add auto-numeration start on 0 up to n, the use must specific position."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list_options = findViewById(R.id.recycleView_options);
        list_options.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        list_options.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new MyAdapter(myDataTitle, myDataDescription);
        list_options.setAdapter(adapter);

    }
}