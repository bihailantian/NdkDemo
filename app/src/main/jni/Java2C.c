#include "com_szgentech_ndkdemo_Java2CJNI.h"
JNIEXPORT jstring JNICALL Java_com_szgentech_ndkdemo_Java2CJNI_java2C(JNIEnv *env,jobject instance){

    return (*env) -> NewStringUTF(env,"I am From Native C .");
}

