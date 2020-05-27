package com.devil64dev.myfilerename;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // String resources for Adapter -> MyAdapter -> list_options
        Resources res_list_options = getResources();  // Resources instance for RecycleView -> list_options
        // Content of RecycleView
        String [] myDataTitle = res_list_options.getStringArray(R.array.options_title);  // Title
        String [] myDataDescription = res_list_options.getStringArray(R.array.options_description);  // Description

        // List for show features or options of the app
        RecyclerView list_options = findViewById(R.id.recycleView_options);
        list_options.setHasFixedSize(true);

        // LayoutManager for RecycleView -> list_options
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        list_options.setLayoutManager(layoutManager);

        // Adapter for RecycleView -> list_options
        RecyclerView.Adapter adapter = new MyAdapter(myDataTitle, myDataDescription);
        list_options.setAdapter(adapter);

        //Adding click adapter;
    }
}