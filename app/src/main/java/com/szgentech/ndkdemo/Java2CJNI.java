package com.szgentech.ndkdemo;



/**
 * Java2CJNI类及本地方法
 */

public class Java2CJNI {

    //加载so库
    static {
        System.loadLibrary("libJava2C");  //设置so文件名称
    }


    public native String java2C();

}
