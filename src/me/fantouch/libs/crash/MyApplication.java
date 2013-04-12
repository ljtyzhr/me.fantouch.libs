
package me.fantouch.libs.crash;

import android.app.Application;
import android.util.Log;

import me.fantouch.libs.log.ELog;
import me.fantouch.libs.test.SendService;

public class MyApplication extends Application {
    private final static String TAG = MyApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate");
        super.onCreate();

        // 注册crashHandler
        CrashHandler.getInstance().init(getApplicationContext(), SendService.class);

        ELog.setEnableLogcat(true);
        ELog.setEnableLogToFile(true, getApplicationContext());
    }
}
