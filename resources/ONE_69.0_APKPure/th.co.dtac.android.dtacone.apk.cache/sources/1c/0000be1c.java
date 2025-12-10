package com.netcetera.threeds.sdk.infrastructure;

import android.content.ContentResolver;
import android.provider.Settings;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setDrawingCacheBackgroundColor extends setBackgroundTintBlendMode {
    private static int get = 0;
    private static int valueOf = 1;

    public setDrawingCacheBackgroundColor(ContentResolver contentResolver) {
        super(contentResolver);
    }

    public String ThreeDS2Service(String str) {
        int i = valueOf;
        int i2 = i & CameraActivity.REQUEST_CODE;
        int i3 = -(-((i ^ CameraActivity.REQUEST_CODE) | i2));
        get = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        String string = Settings.Global.getString(ThreeDS2Service(), str);
        int i4 = valueOf;
        int i5 = i4 & 13;
        int i6 = -(-((i4 ^ 13) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        get = i7 % 128;
        if (i7 % 2 == 0) {
            return string;
        }
        throw null;
    }
}