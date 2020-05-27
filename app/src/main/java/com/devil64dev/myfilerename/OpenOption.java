package com.devil64dev.myfilerename;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.devil64dev.myfilerename.activities.ReplaceActivity;

public class OpenOption implements View.OnClickListener {
    private Context context;

    OpenOption(Context mContext){
        context = mContext;
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, ReplaceActivity.class);
        context.startActivity(intent);
    }
}
