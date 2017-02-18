//
// Created by csdc01 on 2017/2/18.
//
#include<jni.h>
#include<string>
extern "C"

 jstring JNICALL Java_com_example_csdc01_jnitest_HelloJni_stringFromJNI(JNIEnv* env, jobject object){
    std::string hello = "hello";
    return env->NewStringUTF(hello.c_str());
}
