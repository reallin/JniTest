package com.example.csdc01.jnitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    HelloJni helloJni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloJni = new HelloJni();
    }

    public void btnClick(View v){
        Toast.makeText(this,helloJni.stringFromJNI(),Toast.LENGTH_SHORT).show();
    }
}
