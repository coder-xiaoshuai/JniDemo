package com.example.jnidemo.jnitest;

public class JniTest {

    static {
        System.loadLibrary("jni-test");
    }

    public static native String getNativeString();

    public static native int getAddResult(int m, int n);

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
