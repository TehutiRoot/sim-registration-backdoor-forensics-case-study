package com.netcetera.threeds.sdk.infrastructure;

import android.content.ContentResolver;

/* loaded from: classes5.dex */
public abstract class setBackgroundTintBlendMode {
    private static int ThreeDS2ServiceInstance = 1;
    private static int values;
    private ContentResolver ThreeDS2Service;

    public setBackgroundTintBlendMode(ContentResolver contentResolver) {
        this.ThreeDS2Service = contentResolver;
    }

    public ContentResolver ThreeDS2Service() {
        int i = values;
        int i2 = (i & 49) + (i | 49);
        int i3 = i2 % 128;
        ThreeDS2ServiceInstance = i3;
        if (i2 % 2 != 0) {
            ContentResolver contentResolver = this.ThreeDS2Service;
            int i4 = (i3 & 79) + (i3 | 79);
            values = i4 % 128;
            if (i4 % 2 == 0) {
                return contentResolver;
            }
            throw null;
        }
        throw null;
    }
}
