//Android 遊戲APP設計入門--第一支App(物件練習) 2015/7/22 動工
//V1.00 2015/7/23 完工
//V2.00 2017/2/26 改以 Kotlin 取代 Java
//Design by 諸葛魔斌

package net.sytes.citc.app01

//專案名稱：app01

//引入函式庫
import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText

class mainActivity : Activity(), OnClickListener {        //主程式
    internal var btnAdd : Button? = null
    internal var btnMinus : Button? = null
    internal var btnZero : Button? = null         //宣告按鈕物件
    internal var edtShow : EditText? = null       //宣告文字框物件

    internal var i : Int = 0                    //宣告整數變數

    override fun onCreate(savedInstanceState: Bundle?) {        //啟動程式
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd) as Button             //生成按鈕物件
        btnMinus = findViewById(R.id.btnMinus) as Button         //生成按鈕物件
        btnZero = findViewById(R.id.btnZero) as Button           //生成按鈕物件
        edtShow = findViewById(R.id.edtShow) as EditText         //生成文字框物件

        /*
        btnMinus!!.setOnClickListener(object : OnClickListener {
            override fun onClick(v : View?) {
                i--
                edtShow!!.setText("你按了" + i + "次")
            }
        })
        */

        btnMinus!!.setOnClickListener {
            //按一下功能程式
            i--                                            // i 值減 1
            edtShow!!.setText("您按了" + i + "次")            //文字框顯示 "您按了幾次"
        }

        btnZero!!.setOnClickListener(this)
    }

    fun runAdd(v : View) {                             //按一下功能程式
        i++                                                   // i 值加 1
        edtShow!!.setText("你按了" + i + "次")                   //文字框顯示 "您按了幾次"
    }

    override fun onCreateOptionsMenu(menu : Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) : Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onClick(v : View) {
        if (v.id == R.id.btnZero) {
            i = 0                                             // i 值設為 0
            edtShow!!.setText("您按了" + i + "次")               //文字框顯示 "您按了幾次"
        }
    }
}