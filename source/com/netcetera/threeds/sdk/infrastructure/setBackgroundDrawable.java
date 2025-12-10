package com.netcetera.threeds.sdk.infrastructure;

import android.content.ContentResolver;
import android.provider.Settings;

/* loaded from: classes5.dex */
public class setBackgroundDrawable extends setBackgroundTintBlendMode {
    private static int get = 0;
    private static int values = 1;

    public setBackgroundDrawable(ContentResolver contentResolver) {
        super(contentResolver);
    }

    public String get(String str) {
        int i = get;
        int i2 = i & 77;
        int i3 = (i ^ 77) | i2;
        values = ((i2 & i3) + (i3 | i2)) % 128;
        String string = Settings.System.getString(ThreeDS2Service(), str);
        int i4 = values;
        int i5 = i4 & 5;
        get = ((i5 - (~(-(-((i4 ^ 5) | i5))))) - 1) % 128;
        return string;
    }
}
