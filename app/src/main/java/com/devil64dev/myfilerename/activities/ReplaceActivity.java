package com.devil64dev.myfilerename.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.devil64dev.myfilerename.R;

public class ReplaceActivity extends AppCompatActivity {
    private int step_one_options;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replace);

        // get ActionBar for activity and set title of ActionBar
        ActionBar actionBar = getSupportActionBar();
        Resources res = getResources();  // Resources instance for title
        String title = res.getStringArray(R.array.options_title)[0];  // Title of ActionBar
        assert actionBar != null;  // ActionBar no can be null
        actionBar.setTitle(title);  // Set custom title

        // Set radio item click
        RadioGroup sourceFilesOption = findViewById(R.id.ar_step_one_radio_group);
        /* This allow handle checked events and return a checked id
        * */
        sourceFilesOption.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Button select_files = findViewById(R.id.ar_step_one_button_select_files);
                LinearLayout path_to_directory = findViewById(R.id.ar_step_one_parent_pat);

                switch (checkedId){
                    case R.id.ar_step_one_radio_path:
                        step_one_options = 1;
                        if (!(path_to_directory.getVisibility()==View.VISIBLE)){
                            path_to_directory.setVisibility(View.VISIBLE);
                        }

                        if (select_files.getVisibility() == View.VISIBLE){
                            select_files.setVisibility(View.INVISIBLE);
                        }
                        break;

                    case R.id.ar_step_one_radio_select:
                        step_one_options = 2;
                        if (!(select_files.getVisibility()==View.VISIBLE)){
                            select_files.setVisibility(View.VISIBLE);
                        }

                        if (path_to_directory.getVisibility() == View.VISIBLE){
                            path_to_directory.setVisibility(View.INVISIBLE);
                        }
                        break;
                }
            }
        });

        // Some
        if (step_one_options==1){
            EditText editPath = findViewById(R.id.ar_step_one_edit_path);
            //Button btn = findViewById(R.id.ar_step_one_save_path);
        }else{

        }
    }
}
