package com.szgentech.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


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
}
