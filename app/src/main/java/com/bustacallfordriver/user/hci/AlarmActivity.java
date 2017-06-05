package com.bustacallfordriver.user.hci;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * 알람 설정 페이지
 * Created by 강령현 on 2017-05-28.
 */

public class AlarmActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView btn_back;
    Button btn_time1, btn_time2, btn_time3, btn_daily;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
//        Intent intent = getIntent();

        init();
    }
    void init(){
        btn_back = (ImageView)findViewById(R.id.header_alarm_back_btn);
        btn_time1 = (Button)findViewById(R.id.activity_alarm_time1_alarm_btn);
        btn_time2 = (Button)findViewById(R.id.activity_alarm_time2_alarm_btn);
        btn_time3 = (Button)findViewById(R.id.activity_alarm_time3_alarm_btn);
        btn_daily = (Button)findViewById(R.id.activity_alarm_daily_alarm_btn);
        btn_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.header_alarm_back_btn:
                finish();
                break;
        }
    }
}
