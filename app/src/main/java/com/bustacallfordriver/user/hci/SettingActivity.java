package com.bustacallfordriver.user.hci;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by 강령현 on 2017-06-04.
 */

public class SettingActivity extends AppCompatActivity {
    EditText edit_name, edit_age, edit_time;
    Button btn_modify;
    ImageView btn_back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        init();
    }

    void init(){
        edit_name = (EditText) findViewById(R.id.setting_edit_name);
        edit_age = (EditText) findViewById(R.id.setting_edit_age);
        edit_time = (EditText) findViewById(R.id.setting_edit_time);
        btn_modify = (Button)findViewById(R.id.setting_modify_btn);
        btn_back = (ImageView)findViewById(R.id.header_setting_back_btn);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),MainActivity.class);
                startActivity(intent);
            }
        });
    }


}