package com.example.myapplication;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class AlarmActivity extends AppCompatActivity {
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        datePicker.init(2017,0,1,new DatePicker.OnDateChangedListener(){
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth ){
                System.out.printf(String.format("%d년 %d월 %d일", year,monthOfYear + 1, dayOfMonth));
            }
        });
    }
    public void addAlarm(View view){
        new DatePickerDialog(AlarmActivity.this, new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth){
                System.out.printf(String.format("%d년 %d월 %d일", year,month + 1, dayOfMonth));
            }
        }, 2017, 4, 5).show();
    }
    public void setTime(View view){
        new TimePickerDialog(AlarmActivity.this, new TimePickerDialog.OnTimeSetListener(){
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute){
                System.out.printf(String.format("%d시 %d분",hourOfDay,minute));
            }
        },1,1,false).show();
    }
}
