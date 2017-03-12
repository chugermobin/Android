/*
 * Copyright (c) 2016.
 *  諸葛魔斌科技創作室 版權所有
 *  ChuGerMoBin Technology Creative Studio All Rights Reserved.
 */

package com.twcts.simtest;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.gsm.SmsManager;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView txvshow;
    private static final int REQUEST_PERMISSION = 0;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvshow = (TextView) findViewById(R.id.txvshow);

        int spermission = ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
        int rvpermission = ActivityCompat.checkSelfPermission(this, Manifest.permission.RECEIVE_SMS);
        int rpermission = ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_SMS);
        int cpermission = ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS);
        int respermission = ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
        int wespermission = ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        int rppermission = ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);
        int p = 0;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (spermission != PackageManager.PERMISSION_GRANTED || rvpermission != PackageManager.PERMISSION_GRANTED || rpermission != PackageManager.PERMISSION_GRANTED || cpermission != PackageManager.PERMISSION_GRANTED || rppermission != PackageManager.PERMISSION_GRANTED || respermission != PackageManager.PERMISSION_GRANTED || wespermission != PackageManager.PERMISSION_GRANTED) {
                // 無權限，向使用者請求
                runstart();
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS, Manifest.permission.RECEIVE_SMS, Manifest.permission.RECEIVE_SMS, Manifest.permission.READ_CONTACTS, Manifest.permission.READ_PHONE_STATE, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_PERMISSION);
            } else {
                runstart();
            }
        } else {
            runstart();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void runstart() {
        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        String imei1 = tm.getDeviceId(0);
        String imei2 = tm.getDeviceId(1).toString();
        txvshow.setText(imei1.toString() + "\n" + imei2.toString() + "\nAAA");

        SimUtil.sendSMS(this,0,"00970XXXXXXXXX",null,"Hi Stackoverflow! its me Maher. Sent by sim1",null,null);
        SimUtil.sendSMS(this,1,"00970XXXXXXXXX",null,"Hi Stackoverflow! its me Maher. Sent by sim2",null,null);

        String textSMS;
//short <160
//    textSMS = "Hi Stackoverflow! its me Maher.";


//long >160
        textSMS = "Hi Jerusalem, hi Cairo, Hi Prague, hi Baghdad, hi Riyadh, hi Jeddah, hi Dammam, hi Aleppo, hi Casablanca, hi Damascus, hi Alexandria, hi Algiers, hi Mosul, hi Basra, hi Arabia, hi Tripoli, hi Amman, hi Kuwait, hi Beirut, hi Abu Dhabi";

        int simID = 0;//0:sim_1,   1:sim_2

        ArrayList<String> messageList = SmsManager.getDefault().divideMessage(textSMS);
        if (messageList.size() > 1) {
            SimUtil.sendMultipartTextSMS(this, simID, "00972XXXXXXXXX", null, messageList, null, null);
        } else {
            SimUtil.sendSMS(this, simID, "00972XXXXXXXXX", null, textSMS, null, null);
        }



        SubscriptionManager subscriptionManager = SubscriptionManager.from(getApplicationContext());
        List<SubscriptionInfo> subscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
        for (SubscriptionInfo subscriptionInfo : subscriptionInfoList) {
            int subscriptionId = subscriptionInfo.getSubscriptionId();
            Log.d("apipas","subscriptionId:"+subscriptionId);
        }
    }

    public static List<SimInfo> getSIMInfo(Context context) {
        List<SimInfo> simInfoList = new ArrayList<>();
        Uri URI_TELEPHONY = Uri.parse("content://telephony/siminfo/");
        Cursor c = context.getContentResolver().query(URI_TELEPHONY, null, null, null, null);
        if (c.moveToFirst()) {
            do {
                int id = c.getInt(c.getColumnIndex("_id"));
                int slot = c.getInt(c.getColumnIndex("slot"));
                String display_name = c.getString(c.getColumnIndex("display_name"));
                String icc_id = c.getString(c.getColumnIndex("icc_id"));
                SimInfo simInfo = new SimInfo(id, display_name, icc_id, slot);
                Log.d("apipas_sim_info", simInfo.toString());
                simInfoList.add(simInfo);
            } while (c.moveToNext());
        }
        c.close();

        return simInfoList;
    }
}
