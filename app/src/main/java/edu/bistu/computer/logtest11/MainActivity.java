package edu.bistu.computer.logtest11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.bistu.computer.Util.LogUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogUtil.v(TAG,"Verbose Message");
        LogUtil.d(TAG,"Debug Message");
        LogUtil.i(TAG,"Info Message");
        LogUtil.w(TAG,"Warnig Message");
        LogUtil.e(TAG,"Error Message");
    }
}
