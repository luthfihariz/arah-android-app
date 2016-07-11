package arah.android.app;

import android.app.Application;
import android.provider.Settings;

import org.androidannotations.annotations.EApplication;

/**
 * Created by luthfihariz on 1/25/16.
 */
@EApplication
public class ApplicationClass extends Application {


    public String getDeviceId() {
        String deviceID = "";
        try {
            deviceID = Settings.Secure.getString(getApplicationContext().getContentResolver(),
                    Settings.Secure.ANDROID_ID);
        } catch (StackOverflowError e) {

        }
        return deviceID;
    }

}
