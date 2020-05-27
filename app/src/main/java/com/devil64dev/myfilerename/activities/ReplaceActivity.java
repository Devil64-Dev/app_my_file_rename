package com.devil64dev.myfilerename.activities;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.devil64dev.myfilerename.R;

public class ReplaceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_replace);
        ActionBar actionBar = getSupportActionBar();
        Resources res = getResources();
        String title = res.getStringArray(R.array.options_title)[0];
        actionBar.setTitle(title);
    }
}
