#include<jni.h>
JNIEXPORT void JNICALL Java_Happy_printText
  (JNIEnv *env, jobject obj)
{
	printf("Hello");
}