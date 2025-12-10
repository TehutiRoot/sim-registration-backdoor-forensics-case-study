package com.netcetera.threeds.sdk.infrastructure;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes5.dex */
public class setBackground extends setBackgroundTintBlendMode {
    private static int ThreeDS2Service = 0;
    private static int get = 1;

    public setBackground(ContentResolver contentResolver) {
        super(contentResolver);
    }

    public String ThreeDS2ServiceInstance(String str) {
        int i = get;
        int i2 = ((((i ^ 51) | (i & 51)) << 1) - (~(-(((~i) & 51) | (i & (-52)))))) - 1;
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        String string = Settings.Secure.getString(ThreeDS2Service(), str);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return string;
    }
}