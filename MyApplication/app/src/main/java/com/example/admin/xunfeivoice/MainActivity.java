package com.example.admin.xunfeivoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.tv_tts)
    TextView tts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_iat, R.id.tv_tts,R.id.tv_isr})
    @Override
    public void onClick(View view) {
        Log.e("print","tts:"+tts.toString());
        switch (view.getId()) {
            //语音听写
            case R.id.tv_iat:
                startActivity(new Intent(this, IatDemo.class));
                break;
            //语音合成
            case R.id.tv_tts:
                startActivity(new Intent(this, TtsDemo.class));
                break;
            case R.id.tv_isr:
                startActivity(new Intent(this, AsrDemo.class));
                break;
        }
    }
}
