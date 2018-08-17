### 1、NDK的环境搭建

- 如下图所示，下NDK、LLDB、CMake 搭建NDK的开发环境
![NdkDemo](images/ndk1.png)





- 检查SDK Location里面的NDK路径：
![NdkDemo](images/ndk3.png)

- 检查local.properties文件里面有没有NDK路径
![NdkDemo](images/ndk2.png)


### 2、在MainActivity中获取该控件并注册它的点击监听器
```java
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_java2C).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = new Java2CJNI().java2C();
                Log.d(TAG,result);
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
            }
        });
    }
```

