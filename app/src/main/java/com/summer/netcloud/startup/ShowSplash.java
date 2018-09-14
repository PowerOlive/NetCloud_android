package com.summer.netcloud.startup;

import android.os.Handler;

import com.summer.netcloud.Constants;
import com.summer.netcloud.utils.Log;

/**
 * Created by summer on 13/06/2018.
 */

public class ShowSplash extends Starter.Step {
    private static final String TAG = Constants.TAG + ".ShowSplash";

    @Override
    protected int start() {
        Log.d(TAG,"show splash.");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },800);

        return 1;
    }
}
