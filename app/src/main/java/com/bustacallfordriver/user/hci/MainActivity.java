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
    ImageView btn_top_menu1, btn_top_menu2, btn_top_menu3, btn_top_menu4;
    ImageView btn_bottom_menu1, btn_bottom_menu2, btn_bottom_menu3;
    ImageView img_top, img_down;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        btn_setting = (ImageView) findViewById(R.id.header_setting_icon);
        btn_alarm = (ImageView) findViewById(R.id.header_alarm_icon);
        btn_top_menu1 = (ImageView) findViewById(R.id.activity_main_top_menu1);
        btn_top_menu2 = (ImageView) findViewById(R.id.activity_main_top_menu2);
        btn_top_menu3 = (ImageView) findViewById(R.id.activity_main_top_menu3);
        btn_top_menu4 = (ImageView) findViewById(R.id.activity_main_top_menu4);
        btn_bottom_menu1 = (ImageView) findViewById(R.id.activity_main_bottom_menu1);
        btn_bottom_menu2 = (ImageView) findViewById(R.id.activity_main_bottom_menu2);
        btn_bottom_menu3 = (ImageView) findViewById(R.id.activity_main_bottom_menu3);
        img_top = (ImageView) findViewById(R.id.activity_main_top_timeInfo);

        btn_setting.setOnClickListener(this);
        btn_alarm.setOnClickListener(this);
        btn_top_menu1.setOnClickListener(this);
        btn_top_menu2.setOnClickListener(this);
        btn_top_menu3.setOnClickListener(this);
        btn_top_menu4.setOnClickListener(this);
        btn_bottom_menu1.setOnClickListener(this);
        btn_bottom_menu2.setOnClickListener(this);
        btn_bottom_menu3.setOnClickListener(this);
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
            case R.id.activity_main_top_menu1:
                btn_top_menu1.setImageResource(R.drawable.main_top_menu1_on);
                btn_top_menu2.setImageResource(R.drawable.main_top_menu2_off);
                btn_top_menu3.setImageResource(R.drawable.main_top_menu3_off);
                btn_top_menu4.setImageResource(R.drawable.main_top_menu4_off);
                img_top.setImageResource(R.drawable.main_top_timeinfo1);
                break;
            case R.id.activity_main_top_menu2:
                btn_top_menu1.setImageResource(R.drawable.main_top_menu1_off);
                btn_top_menu2.setImageResource(R.drawable.main_top_menu2_on);
                btn_top_menu3.setImageResource(R.drawable.main_top_menu3_off);
                btn_top_menu4.setImageResource(R.drawable.main_top_menu4_off);
                img_top.setImageResource(R.drawable.main_top_timeinfo2);
                break;
            case R.id.activity_main_top_menu3:
                btn_top_menu1.setImageResource(R.drawable.main_top_menu1_off);
                btn_top_menu2.setImageResource(R.drawable.main_top_menu2_off);
                btn_top_menu3.setImageResource(R.drawable.main_top_menu3_on);
                btn_top_menu4.setImageResource(R.drawable.main_top_menu4_off);
                img_top.setImageResource(R.drawable.main_top_timeinfo3);
                break;
            case R.id.activity_main_top_menu4:
                intent = new Intent(getApplication(),GoalActivity.class);
                startActivity(intent);
                break;
            case R.id.activity_main_bottom_menu1:
                break;
            case R.id.activity_main_bottom_menu2:
                break;
            case R.id.activity_main_bottom_menu3:
                break;
        }
    }
}
