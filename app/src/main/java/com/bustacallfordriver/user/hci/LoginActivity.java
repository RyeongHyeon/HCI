package com.bustacallfordriver.user.hci;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * 로그인 페이지
 * Created by 강령현 on 2017-05-28.
 */
public class LoginActivity extends AppCompatActivity {
    EditText edit_name, edit_age, edit_time;
    Button btn_start;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    void init(){
        edit_name = (EditText) findViewById(R.id.login_edit_name);
        edit_age = (EditText) findViewById(R.id.login_edit_age);
        edit_time = (EditText) findViewById(R.id.login_edit_time);
        btn_start = (Button)findViewById(R.id.login_start_btn);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
