/*
 * Copyright (c) 2017.
 *  諸葛魔斌科技創作室 版權所有
 *  ChuGerMoBin Technology Creative Studio All Rights Reserved.
 */

package com.twcts.intent02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BMIActivity extends AppCompatActivity {
    private TextView bmi_result;
    private String bmi_record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        bmi_result = (TextView) findViewById(R.id.bmi_result);

        Bundle extras = getIntent().getExtras();
        double h = extras.getInt("height") / 100.0; // 100.0; (身高/公尺)
        double w = extras.getInt("weight"); // 體重

        double bmiValue = w / Math.pow(h, 2);
        NumberFormat nf = new DecimalFormat("##.00");

        bmi_record = String.format("%s %s %s", bmi_result.getText().toString(), nf.format(bmiValue), getBMIMessage(bmiValue));

        bmi_result.setText(bmi_record);

    }

    private String getBMIMessage(double bmiValue) {
        String message = "";

        if (bmiValue > 0 && bmiValue < 20) {
            message = getResources().getString(R.string.bmi_low);
        } else if (bmiValue >= 20 && bmiValue < 26) {
            message = getResources().getString(R.string.bmi_normal);
        } else if (bmiValue >= 26 && bmiValue < 30) {
            message = getResources().getString(R.string.bmi_high);
        } else if (bmiValue >= 30 && bmiValue < 40) {
            message = getResources().getString(R.string.bmi_overhigh);
        } else if (bmiValue >= 40 && bmiValue <= 100) {
            message = getResources().getString(R.string.bmi_dangerous);
        } else {
            message = getResources().getString(R.string.bmi_value_error);
        }

        return message;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem backItem = menu.add(0, 0, 0, "◄返回");
        backItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //add top-left icon click event deal
        if (item.getItemId() == 0) {
            finish();
        }

        return super.onOptionsItemSelected(item);
        //return false;
    }

    /*
    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (item.getItemId() == 0) {
            finish();
        }

        return super.onMenuItemSelected(featureId, item);
    }
    */
}