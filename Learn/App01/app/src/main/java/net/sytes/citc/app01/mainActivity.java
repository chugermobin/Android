//Android 遊戲APP設計入門--第一支App(物件練習) 2015/7/22 動工
//V1.00 2015/7/23
//Design by 諸葛魔斌

package net.sytes.citc.app01;       //專案名稱：app01

//引入函式庫
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class mainActivity extends Activity implements OnClickListener {        //主程式
    Button btnAdd, btnMinus, btnZero;         //宣告按鈕物件
    EditText edtShow;       //宣告文字框物件

    int i;                    //宣告整數變數

    @Override
    protected void onCreate(Bundle savedInstanceState) {        //啟動程式
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button)findViewById(R.id.btnAdd);             //生成按鈕物件
        btnMinus = (Button)findViewById(R.id.btnMinus);         //生成按鈕物件
        btnZero = (Button)findViewById(R.id.btnZero);           //生成按鈕物件
        edtShow = (EditText)findViewById(R.id.edtShow);         //生成文字框物件

        btnMinus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {                       //按一下功能程式
                i--;                                            // i 值減 1
                edtShow.setText("您按了" + i + "次");            //文字框顯示 "您按了幾次"
            }
        });

        btnZero.setOnClickListener(this);
    }

    public void showText(View v) {                             //按一下功能程式
        i++;                                                   // i 值加 1
        edtShow.setText("您按了" + i + "次");                   //文字框顯示 "您按了幾次"
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnZero) {
            i = 0;                                             // i 值設為 0
            edtShow.setText("您按了" + i + "次");               //文字框顯示 "您按了幾次"
        }
    }
}