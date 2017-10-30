package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
    }
    public void addLayout(View v){
        int id = v.getId();
        LayoutInflater inflater = getLayoutInflater();
        int resID;
        switch (id){
            case R.id.button:
                resID = R.layout.activity_alarm;
                break;
        }

    }
}
