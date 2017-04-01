package com.cn.libtextview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.cn.suptextview.SupTextView;

public class MainActivity extends Activity {

    private SupTextView tv_bank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        tv_bank.setOnSupTextViewClickListener(new SupTextView.OnSupTextViewClickListener() {
            @Override
            public void onSupTextViewClick() {
                super.onSupTextViewClick();
                //do something
                Toast.makeText(MainActivity.this,"onSupTextViewClick",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onLeftTopClick() {
                super.onLeftTopClick();
                //do something
            }

            @Override
            public void onLeftBottomClick() {
                super.onLeftBottomClick();
                //do something
            }

            @Override
            public void onLeftBottomClick2() {
                super.onLeftBottomClick2();
                //do something
                Toast.makeText(MainActivity.this,"LeftBottomClick2",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initView() {
        tv_bank = (SupTextView) findViewById(R.id.tv_bank);
    }
}
