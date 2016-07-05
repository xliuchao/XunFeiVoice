package com.example.admin.xunfeivoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        findViewById(R.id.tv_iat).setOnClickListener(this);
    }
    //语音听写
    @OnClick(R.id.tv_iat)
    @Override
    public void onClick(View view){
         startActivity(new Intent(this,IatDemo.class));
    }
}
