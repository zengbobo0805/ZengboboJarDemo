package com.activity.start;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_1, tv_2, tv_3,tv_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("FirstActivity onCreate");
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_1.setOnClickListener(this);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_2.setOnClickListener(this);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        tv_3.setOnClickListener(this);
        tv_4 = (TextView) findViewById(R.id.tv_4);
        tv_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.tv_1) {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);

        } else if (id == R.id.tv_2) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);

        } else if (id == R.id.tv_3) {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);

        }else if (id == R.id.tv_4) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("FirstActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("FirstActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("FirstActivity onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("FirstActivity onStop");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("FirstActivity onDestroy");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        System.out.println("FirstActivity onNewIntent");
    }
}
