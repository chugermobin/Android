//Android 遊戲APP設計入門--第二支App 2015/7/27 動工
//V1.00 2015/7/27
//Design by 諸葛魔斌

package net.sytes.citc.app02;       //專案名稱：app02

//引入相關函式庫
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    //宣告物件變數
    private ImageView imgPoker01;       //宣告圖片物件
    private ImageView imgPoker02;       //宣告圖片物件
    private ImageView imgPoker03;       //宣告圖片物件
    private ImageView imgPoker04;       //宣告圖片物件
    private ImageView imgPoker05;       //宣告圖片物件
    private Button btnPlay;             //宣告按鈕物件
    private TextView txvTitle;          //宣告文字標籤物件

    private int choiceStatus = 0;         //宣告整數變數()
    /*宣告長度為3的int陣列，並將三張牌的圖檔id放入
      R.drawable.p01：紅心A
      R.drawable.p02：黑桃2
      R.drawable.p03：梅花3
      R.drawable.p04：撲克牌背面 */
    private static int[] s1 = new int[]{R.drawable.p01,R.drawable.p02,R.drawable.p03,R.drawable.p05,R.drawable.p06};       //宣告整數陣列，存放圖檔的記憶體位址

    //啟動程式
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvTitle = (TextView)findViewById(R.id.txvTitle);           //生成文字標籤物件
        imgPoker01 = (ImageView)findViewById(R.id.imgPoker01);      //生成圖片物件
        imgPoker02 = (ImageView)findViewById(R.id.imgPoker02);      //生成圖片物件
        imgPoker03 = (ImageView)findViewById(R.id.imgPoker03);      //生成圖片物件
        imgPoker04 = (ImageView)findViewById(R.id.imgPoker04);      //生成圖片物件
        imgPoker05 = (ImageView)findViewById(R.id.imgPoker05);      //生成圖片物件
        btnPlay = (Button)findViewById(R.id.btnPlay);               //生成按鈕物件

        //執行洗牌程式
        randon();

        //設定imgPoker01執行onClickListener(按按鍵監聽)
        imgPoker01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {           //按下圖1時
                if (choiceStatus == 0) {
                    //三張牌同時翻面，並將未選擇的兩張牌變透明
                    imgPoker01.setImageDrawable(getResources().getDrawable(s1[0]));     //翻面
                    imgPoker02.setImageDrawable(getResources().getDrawable(s1[1]));     //翻面
                    imgPoker03.setImageDrawable(getResources().getDrawable(s1[2]));     //翻面
                    imgPoker04.setImageDrawable(getResources().getDrawable(s1[3]));     //翻面
                    imgPoker05.setImageDrawable(getResources().getDrawable(s1[4]));     //翻面
                    imgPoker02.setAlpha(100);                                           //將未選擇的兩張牌變透明
                    imgPoker02.setAlpha(100);                                           //將未選擇的兩張牌變透明
                    imgPoker04.setAlpha(100);                                           //將未選擇的兩張牌變透明
                    imgPoker05.setAlpha(100);                                           //將未選擇的兩張牌變透明

                    //依有沒有猜對來決定TextView要顯示的訊息
                    if (s1[0] == R.drawable.p01) {                                      //翻對牌
                        txvTitle.setText(R.string.str_right);                    //文字標題顯示"哇!你猜對了喔!!拍拍手!"
                    } else {                                                            //翻錯牌
                        txvTitle.setText(R.string.str_again);              //文字標題顯示"你猜錯了喔!!要不要再試一次?"
                    }

                    choiceStatus = 1;
                }
            }
        });

        //設定imgPoker02執行onClickListener(按按鍵監聽)
        imgPoker02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {           //按下圖2時
                if (choiceStatus == 0) {
                    //三張牌同時翻面，並將未選擇的兩張牌變透明
                    imgPoker01.setImageDrawable(getResources().getDrawable(s1[0]));
                    imgPoker02.setImageDrawable(getResources().getDrawable(s1[1]));
                    imgPoker03.setImageDrawable(getResources().getDrawable(s1[2]));
                    imgPoker04.setImageDrawable(getResources().getDrawable(s1[3]));
                    imgPoker05.setImageDrawable(getResources().getDrawable(s1[4]));
                    imgPoker01.setAlpha(100);
                    imgPoker03.setAlpha(100);
                    imgPoker04.setAlpha(100);
                    imgPoker05.setAlpha(100);

                    //依有沒有猜對來決定TextView要顯示的訊息
                    if (s1[1] == R.drawable.p01) {
                        txvTitle.setText(R.string.str_right);
                    } else {
                        txvTitle.setText(R.string.str_again);
                    }

                    choiceStatus = 1;
                }
            }
        });

        //設定imgPoker03執行onClickListener(按按鍵監聽)
        imgPoker03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {           //按下圖3時
                if (choiceStatus == 0) {
                    //三張牌同時翻面，並將未選擇的兩張牌變透明
                    imgPoker01.setImageDrawable(getResources().getDrawable(s1[0]));
                    imgPoker02.setImageDrawable(getResources().getDrawable(s1[1]));
                    imgPoker03.setImageDrawable(getResources().getDrawable(s1[2]));
                    imgPoker04.setImageDrawable(getResources().getDrawable(s1[3]));
                    imgPoker05.setImageDrawable(getResources().getDrawable(s1[4]));
                    imgPoker01.setAlpha(100);
                    imgPoker02.setAlpha(100);
                    imgPoker04.setAlpha(100);
                    imgPoker05.setAlpha(100);

                    //依有沒有猜對來決定TextView要顯示的訊息
                    if (s1[2] == R.drawable.p01) {
                        txvTitle.setText(R.string.str_right);
                    } else {
                        txvTitle.setText(R.string.str_again);
                    }

                    choiceStatus = 1;
                }
            }
        });

        //設定imgPoker04執行onClickListener(按按鍵監聽)
        imgPoker04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {           //按下圖3時
                if (choiceStatus == 0) {
                    //三張牌同時翻面，並將未選擇的兩張牌變透明
                    imgPoker01.setImageDrawable(getResources().getDrawable(s1[0]));
                    imgPoker02.setImageDrawable(getResources().getDrawable(s1[1]));
                    imgPoker03.setImageDrawable(getResources().getDrawable(s1[2]));
                    imgPoker04.setImageDrawable(getResources().getDrawable(s1[3]));
                    imgPoker05.setImageDrawable(getResources().getDrawable(s1[4]));
                    imgPoker01.setAlpha(100);
                    imgPoker02.setAlpha(100);
                    imgPoker03.setAlpha(100);
                    imgPoker05.setAlpha(100);

                    //依有沒有猜對來決定TextView要顯示的訊息
                    if (s1[3] == R.drawable.p01) {
                        txvTitle.setText(R.string.str_right);
                    } else {
                        txvTitle.setText(R.string.str_again);
                    }

                    choiceStatus = 1;
                }
            }
        });

        //設定imgPoker05執行onClickListener(按按鍵監聽)
        imgPoker05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {           //按下圖3時
                if (choiceStatus == 0) {
                    //三張牌同時翻面，並將未選擇的兩張牌變透明
                    imgPoker01.setImageDrawable(getResources().getDrawable(s1[0]));
                    imgPoker02.setImageDrawable(getResources().getDrawable(s1[1]));
                    imgPoker03.setImageDrawable(getResources().getDrawable(s1[2]));
                    imgPoker04.setImageDrawable(getResources().getDrawable(s1[3]));
                    imgPoker05.setImageDrawable(getResources().getDrawable(s1[4]));
                    imgPoker01.setAlpha(100);
                    imgPoker02.setAlpha(100);
                    imgPoker03.setAlpha(100);
                    imgPoker04.setAlpha(100);

                    //依有沒有猜對來決定TextView要顯示的訊息
                    if (s1[4] == R.drawable.p01) {
                        txvTitle.setText(R.string.str_right);
                    } else {
                        txvTitle.setText(R.string.str_again);
                    }

                    choiceStatus = 1;
                }
            }
        });

        //btnPlay，使其按下後三張牌都翻為背面且重新洗牌
        btnPlay.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                txvTitle.setText(R.string.str_title);
                imgPoker01.setImageDrawable(getResources()
                        .getDrawable(R.drawable.p04));
                imgPoker02.setImageDrawable(getResources()
                        .getDrawable(R.drawable.p04));
                imgPoker03.setImageDrawable(getResources()
                        .getDrawable(R.drawable.p04));
                imgPoker04.setImageDrawable(getResources()
                        .getDrawable(R.drawable.p04));
                imgPoker05.setImageDrawable(getResources()
                        .getDrawable(R.drawable.p04));
                imgPoker01.setAlpha(255);
                imgPoker02.setAlpha(255);
                imgPoker03.setAlpha(255);
                imgPoker04.setAlpha(255);
                imgPoker05.setAlpha(255);
                randon();
                choiceStatus = 0;
            }
        });
    }

    //重新洗牌的程式(取亂數)
    private void randon() {
        for(int i = 0;i < 5;i++) {
            int tmp = s1[i];
            int s = (int)(Math.random() * 4);
            s1[i] = s1[s];
            s1[s] = tmp;
        }
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
}