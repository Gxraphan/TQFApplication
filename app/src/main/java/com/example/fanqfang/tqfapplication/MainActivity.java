package com.example.fanqfang.tqfapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.github.mikephil.charting.charts.BarChart;


import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BarChart chart = (BarChart) findViewById(R.id.bar_chart);

        LinearLayout tqf_2 = (LinearLayout) findViewById(R.id.tqf_2);
        LinearLayout tqf_3 = (LinearLayout) findViewById(R.id.tqf_3);
        LinearLayout tqf_4 = (LinearLayout) findViewById(R.id.tqf_4);
        LinearLayout tqf_5 = (LinearLayout) findViewById(R.id.tqf_5);
        LinearLayout tqf_6 = (LinearLayout) findViewById(R.id.tqf_6);

        tqf_3.setOnClickListener(OnClickTqf3Listener);
        tqf_4.setOnClickListener(OnClickTqf4Listener);

    }

    private View.OnClickListener OnClickTqf3Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent tqf3 = new Intent(getApplicationContext(),TQF_3.class);

            startActivity(tqf3);
        }
    };

    private View.OnClickListener OnClickTqf4Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent tqf4 = new Intent(getApplicationContext(),TQF_4.class);

            startActivity(tqf4);
        }
    };
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));


    }
}

