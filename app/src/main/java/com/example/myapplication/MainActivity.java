package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("VIVZ","onCreate has started");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("VIVZ","onStart has started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("VIVZ","onPause has started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("VIVZ","onResume has started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("VIVZ","onStop has started");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("VIVZ","onDestroy has started");
    }
}
