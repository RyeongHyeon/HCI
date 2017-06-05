package com.bustacallfordriver.user.hci;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by 강령현 on 2017-06-05.
 */

public class GoalActivity extends AppCompatActivity{

    ImageView btn_back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);
        init();
    }
    void init(){
        btn_back = (ImageView)findViewById(R.id.header_goal_back_btn);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}