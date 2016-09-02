package com.droid.manasshrestha.bottomsheets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startBehaviorSheetActivity(View view) {
        startActivity(new Intent(MainActivity.this,BottomSheetBehaviorActivity.class));
    }

    public void startDialogSheetActivity(View view) {
        startActivity(new Intent(MainActivity.this,BottomSheetDialogActivity.class));
    }

}
