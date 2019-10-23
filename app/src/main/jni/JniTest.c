#include <com_example_jnidemo_jnitest_JniTest.h>
#include <jni.h>
#include <stdio.h>
#include <string.h>

void callJavaMethod(JNIEnv *env, jobject thiz)
{
      jclass clazz = (*env)->FindClass(env, "com/example/jnidemo/jnitest/JniTest");
      if(clazz == NULL)
      {
            printf("find class error!");
            return;
      }
      jmethodID id = (*env)->GetStaticMethodID(env, clazz, "printMessage", "(Ljava/lang/String;)V");
      if(id == NULL)
      {
            printf("find method printMessage error!");
            return;
      }
      jstring msg = (*env)->NewStringUTF(env, "msg send by callJavaMethod in JNIMethod.c.");
      (*env)->CallStaticVoidMethod(env, clazz, id, msg);
}

JNIEXPORT jstring JNICALL Java_com_example_jnidemo_jnitest_JniTest_getNativeString
  (JNIEnv *env, jclass thiz){
        callJavaMethod(env,thiz);
       return (*env)->NewStringUTF(env, "Say hello from jni !");
  }

JNIEXPORT jint JNICALL Java_com_example_jnidemo_jnitest_JniTest_getAddResult
  (JNIEnv *env, jclass thiz, jint m, jint n){
        return m + n;
  }