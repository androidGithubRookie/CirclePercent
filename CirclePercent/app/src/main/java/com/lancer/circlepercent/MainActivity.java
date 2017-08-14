package com.lancer.circlepercent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CirclePercentView circle_percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circle_percent = (CirclePercentView) findViewById(R.id.circle_percent);

        findViewById(R.id.circle_percent_btn).setOnClickListener(this);

        circle_percent.setPercent(50, "加载中");
    }

    @Override
    public void onClick(View view) {
        circle_percent.setPercent(Double.valueOf(((EditText) findViewById(R.id.circle_percent_et)).getText().toString()), "加载中");
    }
}
