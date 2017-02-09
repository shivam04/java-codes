#include<jni.h>
#include<stdio.h>
JNIEXPORT void JNICALL Java_NativeCode_callCprog
  (JNIEnv *env, jobject obj, jstring s)
{
	FILE *fp;
	char *data = (*env)->GetStringUTFChars(env,s,NULL);
	fp = fopen("data.txt","w");
	fprintf(fp,"%s",data);
	fclose(fp);
}
