package com.example.linearlayoutexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // 코드로 레이아웃 생성
    public void onButton1Clicked( View v ) {
        Intent intent = new Intent( this, SimpleLayoutCodeActivity.class );
        startActivity(intent);
    }

    // orientation 테스트
    public void onButton2Clicked( View v ) {
        Intent intent = new Intent( this, OrientationTestActivity.class );
        startActivity(intent);
    }

    // gravity 테스트
    public void onButton3Clicked(View v) {
        Intent intent = new Intent( this, GravityTestActivity.class );
        startActivity(intent);
    }

    // laoyout_gravity 테스트
    public void onButton4Clicked(View v) {
        Intent intent = new Intent( this, LayoutGravityActivity.class );
        startActivity(intent);
    }

    // baselineAligned 테스트
    public void onButton5Clicked(View v) {
        Intent intent = new Intent( this, BaselineTestActivity.class );
        startActivity(intent);
    }

    // weight 테스트
    public void onButton6Clicked(View v) {
        Intent intent = new Intent( this, WeightTestActivity.class );
        startActivity(intent);
    }
}
