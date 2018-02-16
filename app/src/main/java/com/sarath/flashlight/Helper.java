package com.sarath.flashlight;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by Sarath on 2/7/18.
 */

public class Helper {

    public static boolean hasFlash(Context context){
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
    }

}
