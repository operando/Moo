package com.os.operando.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.os.operadno.moo.Moo;
import com.os.operando.sample.sample.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Moo.d(TAG, "d test");
        Moo.d(TAG, "d test", new Exception());

        Moo.v(TAG, "v test");
        Moo.v(TAG, "v test", new Exception());

        Moo.i(TAG, "i test");
        Moo.i(TAG, "i test", new Exception());

        Moo.w(TAG, "w test");
        Moo.w(TAG, "w test", new Exception());
        Moo.w(TAG, new Exception("w test"));

        Moo.e(TAG, "e test");
        Moo.e(TAG, "e test", new Exception());

        Moo.wtf(TAG, "wtf test");
        Moo.wtf(TAG, "wtf test", new Exception());
        Moo.w(TAG, new Exception("wtf test"));

        Log.d(TAG, Moo.getStackTraceString(new Exception("test getStackTraceString")));
    }
}
