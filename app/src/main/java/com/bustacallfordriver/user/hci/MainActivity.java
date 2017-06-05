package com.bustacallfordriver.user.hci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * 메인 페이지
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView btn_setting, btn_alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        btn_setting = (ImageView) findViewById(R.id.header_setting_icon);
        btn_alarm = (ImageView) findViewById(R.id.header_alarm_icon);
        btn_setting.setOnClickListener(this);
        btn_alarm.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.header_setting_icon:
                intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
                break;
            case R.id.header_alarm_icon:
                intent = new Intent(MainActivity.this, AlarmActivity.class);
                startActivity(intent);
                break;
        }
    }
}
