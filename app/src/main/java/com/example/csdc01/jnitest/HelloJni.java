package com.example.csdc01.jnitest;

/**
 * Created by linxj on 2017/2/18.
 */

public class HelloJni {

    static{
        System.loadLibrary("hello");
    }

    public native String stringFromJNI();

}
